package com.shopify.admin;

import com.netflix.graphql.dgs.client.CustomGraphQLClient;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import com.netflix.graphql.dgs.client.GraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.HttpResponse;

import com.shopify.admin.client.*;
import com.shopify.admin.types.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import org.junit.Test;

public class AppTest {
    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AppTest.class);

    private static final String PROD_META_KEY = "key";
    private static final String PROD_META_NAME = "The Name";
    private static final String PROD_META_NAMESPACE = "custom";

    private static final String STORE = "<insert you store name here>";
    private static final String TOKEN = "<insert your token here>";

    private CustomGraphQLClient client;

    @Test
    public void testOne() throws Exception {
        log.info("testOne");

        String endpointUrl = "https://" + STORE + ".myshopify.com/admin/api/2025-04/graphql.json";

        RestTemplate restTemplate = new RestTemplate();
        client = GraphQLClient.createCustom(endpointUrl, (url, headers, body) -> {

            HttpHeaders httpHeaders = new HttpHeaders();
            headers.forEach(httpHeaders::addAll);
            httpHeaders.add("X-Shopify-Access-Token", TOKEN);

            ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST,
                    new HttpEntity<>(body, httpHeaders), String.class);
            return new HttpResponse(exchange.getStatusCodeValue(), exchange.getBody());
        });

        createMetafieldDefinition();
        listMetafieldDefinitions();
        listMetaobjectDefinitions();
        listCollections();
        listProducts(null);
        createProductAdvanced("Lollipops - Advanced");
        createProduct("Lollipops", "lolli");
        createProductFixedBundle();
        createVariantFixedBundle();
        listProducts(null);
        setInventory();
    }

    private void setInventory() {
        java.util.List<Location> locations = listLocations();
        Location location = locations.get(0);

        int count = 9;

        java.util.List<Product> products = listProducts(null);
        for (Product product : products) {
            ProductVariantConnection variants = product.getVariants();
            java.util.List<ProductVariantEdge> vEdges = variants.getEdges();
            for (ProductVariantEdge vEdge : vEdges) {
                ProductVariant variant = vEdge.getNode();
                InventoryItem inventoryItem = variant.getInventoryItem();
                log.info("\t\t" + inventoryItem.getId());

                InventorySetQuantitiesGraphQLQuery.Builder builder = InventorySetQuantitiesGraphQLQuery.newRequest();
                InventorySetQuantitiesInput input = new InventorySetQuantitiesInput();
                input.setName("available");
                input.setIgnoreCompareQuantity(true);
                input.setReason("quality_control");
                java.util.List<InventoryQuantityInput> quantities = new java.util.ArrayList<>();
                InventoryQuantityInput quantity = new InventoryQuantityInput();
                quantity.setInventoryItemId(inventoryItem.getId());
                quantity.setLocationId(location.getId());
                quantity.setQuantity(count);
                count = count + 9;
                quantities.add(quantity);
                input.setQuantities(quantities);
                builder.input(input);
                InventorySetQuantitiesGraphQLQuery query = builder.build();

                InventorySetQuantitiesProjectionRoot root = new InventorySetQuantitiesProjectionRoot();

                InventoryAdjustmentGroupProjection group = root.inventoryAdjustmentGroup();
                group.id();

                InventorySetQuantitiesUserErrorProjection userErrors = root.userErrors();
                userErrors.field();
                userErrors.message();

                GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
                log.debug("Request: " + request.serialize());
                GraphQLResponse response = client.executeQuery(request.serialize());
                log.debug("Response: " + response);

                InventorySetQuantitiesPayload payload = response.extractValueAsObject("inventorySetQuantities",
                        InventorySetQuantitiesPayload.class);
                InventoryAdjustmentGroup inventoryAdjustment = payload.getInventoryAdjustmentGroup();
                if (inventoryAdjustment != null) {
                    log.info("Adjusted: " + inventoryAdjustment.getId());
                } else {
                    log.error("Response: " + response);
                }
            }
        }
    }

    private ProductOperationStatus getStatus(String id) throws Exception {

        ProductOperationGraphQLQuery.Builder builder = ProductOperationGraphQLQuery.newRequest();
        builder.id(id);
        ProductOperationGraphQLQuery query = builder.build();

        ProductOperationProjectionRoot root = new ProductOperationProjectionRoot();
        ProductBundleOperationFragmentProjection fragment = root.onProductBundleOperation();
        ProductProjection product = fragment.product();
        product.id();
        fragment.status();

        ProductBundleMutationUserErrorProjection userErrors = fragment.userErrors();
        userErrors.code();
        userErrors.field();
        userErrors.message();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.debug("Request: " + request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("Response: " + response);

        ProductOperation results = response.extractValueAsObject("productOperation", ProductOperation.class);
        ProductOperationStatus status = results.getStatus();
        return status;
    }

    private void createMetafieldDefinition() throws Exception {
        MetafieldDefinitionCreateGraphQLQuery.Builder builder = MetafieldDefinitionCreateGraphQLQuery.newRequest();

        MetafieldDefinitionInput definition = new MetafieldDefinitionInput();
        definition.setKey(PROD_META_KEY);
        definition.setName(PROD_META_NAME);
        definition.setNamespace(PROD_META_NAMESPACE);
        definition.setOwnerType(MetafieldOwnerType.PRODUCT);
        definition.setPin(true);

        // Valid types are: boolean, color, date_time, date, dimension, id, json, language, list.color, list.date_time,
        // list.date, list.dimension, list.number_decimal, list.number_integer, list.rating,
        // list.single_line_text_field, list.url, list.volume, list.weight, money, multi_line_text_field,
        // number_decimal, number_integer, rating, rich_text_field, single_line_text_field, url, link, list.link,
        // volume, weight, company_reference, list.company_reference, customer_reference, list.customer_reference,
        // product_reference, list.product_reference, collection_reference, list.collection_reference,
        // variant_reference, list.variant_reference, file_reference, list.file_reference,
        // product_taxonomy_value_reference, list.product_taxonomy_value_reference, metaobject_reference,
        // list.metaobject_reference, mixed_reference, list.mixed_reference, page_reference, list.page_reference,
        // order_reference.
        definition.setType("single_line_text_field");

        builder.definition(definition);

        MetafieldDefinitionCreateGraphQLQuery query = builder.build();

        MetafieldDefinitionCreateProjectionRoot root = new MetafieldDefinitionCreateProjectionRoot();

        MetafieldDefinitionCreateUserErrorProjection userErrors = root.userErrors();
        userErrors.field();
        userErrors.message();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.info("request:" + request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.info("response: " + response);
    }

    private void createProductFixedBundle() throws Exception {

        Product shampoo = createProductAdvanced("ABC Shampoo");
        ProductOption shampooOption = shampoo.getOptions().get(0);
        log.info("shampooOption: " + shampooOption.getId());

        Product soap = createProductAdvanced("ABC Soap");
        ProductOption soapOption = soap.getOptions().get(0);
        log.info("soapOption: " + soapOption.getId());

        ProductBundleCreateGraphQLQuery.Builder builder = ProductBundleCreateGraphQLQuery.newRequest();

        ProductBundleCreateInput productBundleCreateInput = new ProductBundleCreateInput();
        productBundleCreateInput.setTitle("ABC The hair and skin bundle");

        java.util.List<ProductBundleComponentInput> components = new java.util.ArrayList<>();

        ProductBundleComponentInput component1 = new ProductBundleComponentInput();
        java.util.List<ProductBundleComponentOptionSelectionInput> component1options = new java.util.ArrayList<>();
        ProductBundleComponentOptionSelectionInput component1option = new ProductBundleComponentOptionSelectionInput();
        component1option.setComponentOptionId(shampooOption.getId());
        component1option.setName("Shampoo Size");
        java.util.List<String> values1 = new java.util.ArrayList<>();
        values1.add("100");
        values1.add("200");
        component1option.setValues(values1);
        component1options.add(component1option);
        component1.setOptionSelections(component1options);
        component1.setProductId(shampoo.getId());
        component1.setQuantity(1);
        components.add(component1);

        ProductBundleComponentInput component2 = new ProductBundleComponentInput();
        java.util.List<ProductBundleComponentOptionSelectionInput> component2options = new java.util.ArrayList<>();
        ProductBundleComponentOptionSelectionInput component2option = new ProductBundleComponentOptionSelectionInput();
        component2option.setComponentOptionId(soapOption.getId());
        component2option.setName("Soap Size");
        java.util.List<String> values2 = new java.util.ArrayList<>();
        values2.add("100");
        values2.add("200");
        component2option.setValues(values2);
        component2options.add(component2option);
        component2.setOptionSelections(component2options);
        component2.setProductId(soap.getId());
        component2.setQuantity(1);
        components.add(component2);

        productBundleCreateInput.setComponents(components);

        builder.input(productBundleCreateInput);
        ProductBundleCreateGraphQLQuery query = builder.build();

        ProductBundleCreateProjectionRoot root = new ProductBundleCreateProjectionRoot();

        ProductBundleOperationProjection operation = root.productBundleOperation();
        operation.id();

        UserErrorProjection userError = root.userErrors();
        userError.message();
        userError.field();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.debug("request:" + request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("response: " + response);

        ProductBundleCreatePayload payload = response.extractValueAsObject("productBundleCreate",
                ProductBundleCreatePayload.class);
        ProductBundleOperation operationPayload = payload.getProductBundleOperation();
        String id = operationPayload.getId();

        ProductOperationStatus status = getStatus(id);
        while (ProductOperationStatus.ACTIVE == status) {
            Thread.sleep(1000);
            status = getStatus(id);
        }
    }

    public void createVariantFixedBundle() throws Exception {

        Product bundle = createProduct("XYZ The Hair And Skin Bundle", "xyz");
        ProductVariant bundleVariant = null;
        ProductVariantConnection variants = bundle.getVariants();
        java.util.List<ProductVariantEdge> vEdges = variants.getEdges();
        for (ProductVariantEdge vEdge : vEdges) {
            bundleVariant = vEdge.getNode();
        }

        Product shampoo = createProduct("XYZ Shampoo", "shampoo");
        ProductVariant shampooVariant = null;
        variants = shampoo.getVariants();
        vEdges = variants.getEdges();
        for (ProductVariantEdge vEdge : vEdges) {
            shampooVariant = vEdge.getNode();
        }

        Product soap = createProduct("XYZ Soap", "soap");
        ProductVariant soapVariant = null;
        variants = soap.getVariants();
        vEdges = variants.getEdges();
        for (ProductVariantEdge vEdge : vEdges) {
            soapVariant = vEdge.getNode();
        }

        log.info("Parent: " + bundleVariant.getId());
        log.info("\t" + shampooVariant.getId());
        log.info("\t" + soapVariant.getId());

        ProductVariantRelationshipBulkUpdateGraphQLQuery.Builder builder = ProductVariantRelationshipBulkUpdateGraphQLQuery
                .newRequest();

        java.util.List<ProductVariantRelationshipUpdateInput> inputs = new java.util.ArrayList<>();

        ProductVariantRelationshipUpdateInput input = new ProductVariantRelationshipUpdateInput();
        input.setParentProductVariantId(bundleVariant.getId());
        java.util.List<ProductVariantGroupRelationshipInput> components = new java.util.ArrayList<>();

        ProductVariantGroupRelationshipInput component1 = new ProductVariantGroupRelationshipInput();
        component1.setId(shampooVariant.getId());
        component1.setQuantity(1);
        components.add(component1);

        ProductVariantGroupRelationshipInput component2 = new ProductVariantGroupRelationshipInput();
        component2.setId(soapVariant.getId());
        component2.setQuantity(1);
        components.add(component2);

        input.setProductVariantRelationshipsToCreate(components);
        inputs.add(input);

        builder.input(inputs);

        ProductVariantRelationshipBulkUpdateGraphQLQuery query = builder.build();

        ProductVariantRelationshipBulkUpdateProjectionRoot root = new ProductVariantRelationshipBulkUpdateProjectionRoot();

        ProductVariantRelationshipBulkUpdateUserErrorProjection userErrors = root.userErrors();
        userErrors.field();
        userErrors.message();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.debug(request.serialize());

        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("Response: " + response);

        ProductVariantRelationshipBulkUpdatePayload payload = response.extractValueAsObject(
                "productVariantRelationshipBulkUpdate", ProductVariantRelationshipBulkUpdatePayload.class);

        java.util.List<ProductVariantRelationshipBulkUpdateUserError> errors = payload.getUserErrors();
        for (ProductVariantRelationshipBulkUpdateUserError error : errors) {
            log.error("Error: " + error.getField() + " -> " + error.getMessage());
        }
    }

    private java.util.List<Collection> listCollections() {
        java.util.List<Collection> collections = new java.util.ArrayList<>();

        CollectionsGraphQLQuery.Builder builder = CollectionsGraphQLQuery.newRequest();
        builder.first(250);
        CollectionsGraphQLQuery query = builder.build();

        CollectionsProjectionRoot root = new CollectionsProjectionRoot();
        CollectionEdgeProjection edgeProjection = root.edges();
        CollectionProjection collectionProjection = edgeProjection.node();
        collectionProjection.id();
        collectionProjection.title();
        CollectionRuleSetProjection ruleset = collectionProjection.ruleSet();
        ruleset.appliedDisjunctively();
        CollectionRuleProjection rules = ruleset.rules();
        rules.column();
        rules.condition();
        rules.relation();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.debug(request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("Response: " + response);
        CollectionConnection results = response.extractValueAsObject("collections", CollectionConnection.class);

        java.util.List<CollectionEdge> edges = results.getEdges();
        for (CollectionEdge edge : edges) {
            Collection collection = edge.getNode();
            collections.add(collection);
            log.info("Id: " + collection.getId() + "\t" + collection.getTitle());
            CollectionRuleSet ruleSet = collection.getRuleSet();
            if (ruleSet == null) {
                continue;
            }
            log.info("\tMust Match any: " + ruleSet.getAppliedDisjunctively());
            for (CollectionRule rule : ruleSet.getRules()) {
                log.info("\t\t" + rule.getColumn() + "\t" + rule.getRelation() + "\t" + rule.getCondition());
            }
        }

        return collections;
    }

    private java.util.List<Location> listLocations() {
        java.util.List<Location> locations = new java.util.ArrayList<>();

        LocationsGraphQLQuery.Builder builder = LocationsGraphQLQuery.newRequest();
        builder.first(250);
        LocationsGraphQLQuery query = builder.build();

        LocationsProjectionRoot root = new LocationsProjectionRoot();
        LocationEdgeProjection edgeProjection = root.edges();
        LocationProjection locationProjection = edgeProjection.node();
        locationProjection.id();
        locationProjection.name();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.debug(request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("Response: " + response);
        LocationConnection results = response.extractValueAsObject("locations", LocationConnection.class);

        java.util.List<LocationEdge> edges = results.getEdges();
        for (LocationEdge edge : edges) {
            Location location = edge.getNode();
            log.debug("Id: " + location.getId() + "\t" + location.getName());
            locations.add(location);
        }

        return locations;
    }

    private void listMetafieldDefinitions() {

        MetafieldDefinitionsGraphQLQuery.Builder builder = MetafieldDefinitionsGraphQLQuery.newRequest();
        builder.first(250);
        builder.ownerType(MetafieldOwnerType.PRODUCT);
        MetafieldDefinitionsGraphQLQuery query = builder.build();

        MetafieldDefinitionsProjectionRoot root = new MetafieldDefinitionsProjectionRoot();
        MetafieldDefinitionEdgeProjection edges = root.edges();
        MetafieldDefinitionProjection node = edges.node();

        node.id();
        node.key();
        node.namespace();

        MetafieldOwnerTypeProjection ownerType = node.ownerType();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.debug("Query: " + request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("Response: " + response);

        MetafieldConnection results = response.extractValueAsObject("metafieldDefinitions", MetafieldConnection.class);

        java.util.List<MetafieldEdge> metaEdges = results.getEdges();
        for (MetafieldEdge edge : metaEdges) {
            Metafield metafield = edge.getNode();
            log.info("Id: " + metafield.getId() + "\t" + metafield.getNamespace() + "\t" + metafield.getKey());
        }

    }

    private void listMetaobjectDefinitions() {

        MetaobjectDefinitionsGraphQLQuery.Builder builder = MetaobjectDefinitionsGraphQLQuery.newRequest();
        builder.first(250);
        MetaobjectDefinitionsGraphQLQuery query = builder.build();

        MetaobjectDefinitionsProjectionRoot root = new MetaobjectDefinitionsProjectionRoot();

        MetaobjectDefinitionEdgeProjection edgeProjection = root.edges();
        MetaobjectDefinitionProjection nodeProjection = edgeProjection.node();
        nodeProjection.description();
        nodeProjection.id();
        nodeProjection.type();

        MetaobjectDefinitionProjection metaProjection = root.nodes();
        metaProjection.description();
        metaProjection.id();
        metaProjection.type();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.debug("Query: " + request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("Response: " + response);

        MetaobjectDefinitionConnection results = response.extractValueAsObject("metaobjectDefinitions",
                MetaobjectDefinitionConnection.class);

        java.util.List<MetaobjectDefinitionEdge> metaEdges = results.getEdges();
        for (MetaobjectDefinitionEdge edge : metaEdges) {
            MetaobjectDefinition metaobject = edge.getNode();
            log.info("Id: " + metaobject.getId() + "\t" + metaobject.getType() + "\t" + metaobject.getDescription());
        }
    }

    private java.util.List<Product> listProducts(String after) {

        java.util.List<Product> products = new java.util.ArrayList<>();

        ProductsGraphQLQuery.Builder builder = ProductsGraphQLQuery.newRequest();
        if (after != null) {
            builder.after(after);
        }
        builder.first(250);
        ProductsGraphQLQuery query = builder.build();

        ProductsProjectionRoot root = new ProductsProjectionRoot();
        ProductEdgeProjection edgeProjection = root.edges();
        ProductProjection productProjection = edgeProjection.node();

        productProjection.handle();
        productProjection.id();
        productProjection.status();
        productProjection.tags();

        ProductVariantConnectionProjection variantConnectionProjection = productProjection.variants(10, null, null,
                null, null, null);
        ProductVariantEdgeProjection vEdgeProjection = variantConnectionProjection.edges();
        ProductVariantProjection variantProjection = vEdgeProjection.node();
        variantProjection.barcode();
        variantProjection.compareAtPrice();
        variantProjection.id();
        InventoryItemProjection inventoryItemProjection = variantProjection.inventoryItem();
        inventoryItemProjection.id();
        variantProjection.price();
        variantProjection.sku();

        productProjection.vendor();

        PageInfoProjection pageInfoProjection = root.pageInfo();
        pageInfoProjection.endCursor();
        pageInfoProjection.hasNextPage();
        pageInfoProjection.startCursor();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);

        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("Response: " + response);
        ProductConnection results = response.extractValueAsObject("products", ProductConnection.class);

        java.util.List<ProductEdge> edges = results.getEdges();
        for (ProductEdge edge : edges) {
            Product product = edge.getNode();
            products.add(product);
            log.info("Id: " + product.getId() + "\t" + product.getHandle() + "\t" + product.getStatus() + "\t"
                    + product.getVendor() + product.getTags());

            ProductVariantConnection variants = product.getVariants();
            java.util.List<ProductVariantEdge> vEdges = variants.getEdges();
            for (ProductVariantEdge vEdge : vEdges) {
                ProductVariant variant = vEdge.getNode();
                log.info("\t" + variant.getPrice() + "\t" + variant.getCompareAtPrice() + "\t" + variant.getId() + "\t"
                        + variant.getBarcode() + "\t" + variant.getSku());
                InventoryItem inventoryItem = variant.getInventoryItem();
                log.info("\t\t" + inventoryItem.getId());
            }
        }

        PageInfo pageInfo = results.getPageInfo();
        if (pageInfo.getHasNextPage()) {
            products.addAll(listProducts(pageInfo.getEndCursor()));
        }

        return products;
    }

    // simpler option for initial product creation
    private Product createProduct(String title, String handle) throws Exception {
        ProductCreateGraphQLQuery.Builder builder = ProductCreateGraphQLQuery.newRequest();

        ProductCreateInput productInput = new ProductCreateInput();
        productInput.setDescriptionHtml("Bag of Lollipops");
        productInput.setHandle(handle);

        java.util.List<MetafieldInput> metafields = new java.util.ArrayList<>();

        MetafieldInput metaInput = new MetafieldInput();

        metaInput.setKey(PROD_META_KEY);
        metaInput.setNamespace(PROD_META_NAMESPACE);
        metaInput.setValue("Yummy");

        metafields.add(metaInput);

        productInput.setMetafields(metafields);

        SEOInput seo = new SEOInput();
        seo.setDescription("SEO META");
        seo.setTitle("SEO Title");
        productInput.setSeo(seo);

        java.util.List<OptionCreateInput> options = new java.util.ArrayList<>();
        OptionCreateInput option = new OptionCreateInput();

        java.util.List<OptionValueCreateInput> values = new java.util.ArrayList<>();
        OptionValueCreateInput value1 = new OptionValueCreateInput();
        value1.setName("100");
        values.add(value1);

        option.setName("Size");
        option.setValues(values);
        options.add(option);
        productInput.setProductOptions(options);

        java.util.List<String> tags = new java.util.ArrayList<>();
        tags.add("Red");
        tags.add("Blue");
        tags.add("Green");
        tags.add("White");
        productInput.setTags(tags);
        productInput.setTitle(title);
        productInput.setVendor("ACME");

        builder.product(productInput);
        ProductCreateGraphQLQuery query = builder.build();

        // fields we would like returned
        ProductCreateProjectionRoot root = new ProductCreateProjectionRoot();
        ProductProjection productProjection = root.product();
        productProjection.id();

        ProductVariantConnectionProjection variantConnectionProjection = productProjection.variants(10, null, null,
                null, null, null);
        ProductVariantEdgeProjection vEdgeProjection = variantConnectionProjection.edges();
        ProductVariantProjection variantProjection = vEdgeProjection.node();
        variantProjection.id();
        variantProjection.price();

        UserErrorProjection userError = root.userErrors();
        userError.message();
        userError.field();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        GraphQLResponse response = client.executeQuery(request.serialize());

        ProductCreatePayload payload = response.extractValueAsObject("productCreate", ProductCreatePayload.class);
        Product product = payload.getProduct();
        java.util.List<UserError> errors = payload.getUserErrors();
        for (UserError error : errors) {
            log.error("Error: " + error.toString());
        }

        log.info("Created new product with Id: " + product.getId());
        ProductVariant variant = null;
        ProductVariantConnection variants = product.getVariants();
        java.util.List<ProductVariantEdge> vEdges = variants.getEdges();
        for (ProductVariantEdge vEdge : vEdges) {
            variant = vEdge.getNode();
        }

        updateVariant(product, variant, "3.45", "6.99");
        createVariants(product);

        java.io.File file = new java.io.File("src/test/resources/lollipops.jpg");
        uploadImage(product, file);

        return product;
    }

    private Product createProductAdvanced(String title) throws Exception {

        ProductSetGraphQLQuery.Builder builder = ProductSetGraphQLQuery.newRequest();

        ProductSetInput productSetInput = new ProductSetInput();

        java.util.List<OptionSetInput> productOptions = new java.util.ArrayList<>();

        OptionSetInput sizeOption = new OptionSetInput();
        sizeOption.setName("Size");

        java.util.List<OptionValueSetInput> values = new java.util.ArrayList<>();

        OptionValueSetInput option1 = new OptionValueSetInput();
        option1.setName("100");
        values.add(option1);

        OptionValueSetInput option2 = new OptionValueSetInput();
        option2.setName("200");
        values.add(option2);

        sizeOption.setValues(values);
        productOptions.add(sizeOption);
        productSetInput.setProductOptions(productOptions);

        java.util.List<String> tags = new java.util.ArrayList<>();
        tags.add("Red");
        tags.add("Blue");
        tags.add("Green");
        tags.add("White");
        productSetInput.setTags(tags);
        productSetInput.setTitle(title);

        java.util.List<ProductVariantSetInput> variants = new java.util.ArrayList<>();

        java.util.List<VariantOptionValueInput> optionValues200 = new java.util.ArrayList<>();
        VariantOptionValueInput optionValue200 = new VariantOptionValueInput();
        optionValue200.setName("200");
        optionValue200.setOptionName("Size");
        optionValues200.add(optionValue200);

        ProductVariantSetInput variant1 = new ProductVariantSetInput();
        variant1.setOptionValues(optionValues200);
        variant1.setBarcode("8410031950656");
        variant1.setInventoryPolicy(ProductVariantInventoryPolicy.DENY);

        variant1.setPrice("6.89");
        variant1.setSku("loli200");
        variants.add(variant1);

        java.util.List<VariantOptionValueInput> optionValues100 = new java.util.ArrayList<>();
        VariantOptionValueInput optionValue100 = new VariantOptionValueInput();
        optionValue100.setName("100");
        optionValue100.setOptionName("Size");
        optionValues100.add(optionValue100);

        ProductVariantSetInput variant2 = new ProductVariantSetInput();
        variant2.setOptionValues(optionValues100);
        variant2.setBarcode("8410031950656");
        variant2.setInventoryPolicy(ProductVariantInventoryPolicy.DENY);
        variant2.setPrice("3.45");
        variant2.setSku("loli100");
        variants.add(variant2);

        productSetInput.setVariants(variants);
        builder.input(productSetInput);
        ProductSetGraphQLQuery query = builder.build();

        // fields we would like returned
        ProductSetProjectionRoot root = new ProductSetProjectionRoot();
        ProductProjection productProjection = root.product();
        productProjection.id();
        ProductOptionProjection productOption = productProjection.options();
        productOption.id();

        ProductVariantConnectionProjection variantConnectionProjection = productProjection.variants(10, null, null,
                null, null, null);
        ProductVariantEdgeProjection vEdgeProjection = variantConnectionProjection.edges();
        ProductVariantProjection variantProjection = vEdgeProjection.node();
        variantProjection.id();
        variantProjection.price();

        ProductSetUserErrorProjection userError = root.userErrors();
        userError.message();
        userError.field();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.debug("request:" + request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("response: " + response);

        ProductSetPayload payload = response.extractValueAsObject("productSet", ProductSetPayload.class);
        java.util.List<ProductSetUserError> errors = payload.getUserErrors();
        for (ProductSetUserError error : errors) {
            log.error("Error: " + error.toString());
        }
        Product product = payload.getProduct();

        log.info("Created new product with Id: " + product.getId());

        java.io.File file = new java.io.File("src/test/resources/lollipops.jpg");
        uploadImage(product, file);

        return product;
    }

    private void createVariants(Product product) throws Exception {

        java.util.List<ProductVariantsBulkInput> variants = new java.util.ArrayList<>();

        java.util.List<VariantOptionValueInput> optionValues200 = new java.util.ArrayList<>();
        VariantOptionValueInput optionValue200 = new VariantOptionValueInput();
        optionValue200.setName("200");
        optionValue200.setOptionName("Size");
        optionValues200.add(optionValue200);

        ProductVariantsBulkInput variant1 = new ProductVariantsBulkInput();
        variant1.setOptionValues(optionValues200);
        variant1.setBarcode("8410031950656");
        InventoryItemInput inventoryItemInput = new InventoryItemInput();
        InventoryItemMeasurementInput measurement = new InventoryItemMeasurementInput();
        WeightInput weight = new WeightInput();
        weight.setValue(89.9);
        weight.setUnit(WeightUnit.POUNDS);
        measurement.setWeight(weight);
        inventoryItemInput.setMeasurement(measurement);
        inventoryItemInput.setRequiresShipping(true);
        inventoryItemInput.setSku("SKU");
        inventoryItemInput.setTracked(true);
        inventoryItemInput.setRequiresShipping(true);

        variant1.setInventoryItem(inventoryItemInput);
        variant1.setPrice("6.89");
        variants.add(variant1);

        java.util.Set<String> fieldsSet = new java.util.HashSet<>();
        ProductVariantsBulkCreateGraphQLQuery query = new ProductVariantsBulkCreateGraphQLQuery(variants,
                product.getId(), null, null, null, fieldsSet);

        ProductVariantsBulkCreateProjectionRoot root = new ProductVariantsBulkCreateProjectionRoot();
        ProductVariantsBulkCreateUserErrorProjection userError = root.userErrors();
        userError.field();
        userError.message();

        com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest request = new com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest(
                query, root);
        log.trace("Query: " + request.serialize());

        com.netflix.graphql.dgs.client.GraphQLResponse response = client.executeQuery(request.serialize());
        log.trace("Response: " + response.toString());
        ProductVariantsBulkCreatePayload payload = response.extractValueAsObject("productVariantsBulkCreate",
                ProductVariantsBulkCreatePayload.class);
    }

    private void updateVariant(Product product, ProductVariant productVariant, String price, String compareAt) {

        java.util.List<ProductVariantsBulkInput> variants = new java.util.ArrayList();

        ProductVariantsBulkInput variant = new ProductVariantsBulkInput();
        variant.setBarcode("8410031950656");
        variant.setCompareAtPrice(compareAt);
        variant.setId(productVariant.getId());
        InventoryItemInput inventoryItemInput = new InventoryItemInput();
        InventoryItemMeasurementInput measurement = new InventoryItemMeasurementInput();
        WeightInput weight = new WeightInput();
        weight.setValue(99.9);
        weight.setUnit(WeightUnit.POUNDS);
        measurement.setWeight(weight);
        inventoryItemInput.setMeasurement(measurement);
        inventoryItemInput.setRequiresShipping(true);
        inventoryItemInput.setSku("SKU");
        inventoryItemInput.setTracked(true);
        inventoryItemInput.setRequiresShipping(true);

        variant.setInventoryItem(inventoryItemInput);
        variant.setInventoryPolicy(ProductVariantInventoryPolicy.DENY);
        variant.setPrice(price);
        variants.add(variant);

        java.util.Set<String> fieldsSet = new java.util.HashSet<>();
        ProductVariantsBulkUpdateGraphQLQuery query = new ProductVariantsBulkUpdateGraphQLQuery(variants,
                product.getId(), null, true, null, fieldsSet);

        ProductVariantsBulkUpdateProjectionRoot root = new ProductVariantsBulkUpdateProjectionRoot();
        ProductVariantsBulkUpdateUserErrorProjection userError = root.userErrors();
        userError.field();
        userError.message();

        com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest request = new com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest(
                query, root);
        log.trace("Query: " + request.serialize());

        com.netflix.graphql.dgs.client.GraphQLResponse response = client.executeQuery(request.serialize());
        log.trace("Response: " + response.toString());

        ProductVariantsBulkUpdatePayload payload = response.extractValueAsObject("productVariantsBulkUpdate",
                ProductVariantsBulkUpdatePayload.class);

        java.util.List<ProductVariantsBulkUpdateUserError> errors = payload.getUserErrors();
        for (ProductVariantsBulkUpdateUserError error : errors) {
            log.error(error.getField() + "\t" + error.getMessage());
        }
    }

    private void uploadImage(Product product, java.io.File file) throws Exception {
        java.util.List<StagedUploadInput> inputs = new java.util.ArrayList<>();
        StagedUploadInput input = new StagedUploadInput();
        input.setFilename(file.getName());
        input.setFileSize(new Long(file.length()).toString());
        input.setHttpMethod(StagedUploadHttpMethodType.PUT);
        input.setMimeType("image/jpg");
        input.setResource(StagedUploadTargetGenerateUploadResource.IMAGE);
        inputs.add(input);

        java.util.Set<String> fieldsSet = new java.util.HashSet<>();
        StagedUploadsCreateGraphQLQuery query = new StagedUploadsCreateGraphQLQuery(inputs, null, fieldsSet);

        StagedUploadsCreateProjectionRoot root = new StagedUploadsCreateProjectionRoot();

        StagedMediaUploadTargetProjection staged = root.stagedTargets();
        staged.resourceUrl();
        staged.url();

        StagedUploadParameterProjection parameters = staged.parameters();
        parameters.name();
        parameters.value();

        UserErrorProjection userError = root.userErrors();
        userError.field();
        userError.message();

        com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest request = new com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest(
                query, root);
        log.trace("Query: " + request.serialize());

        com.netflix.graphql.dgs.client.GraphQLResponse response = client.executeQuery(request.serialize());
        log.trace("Response: " + response.toString());

        StagedUploadsCreatePayload payload = response.extractValueAsObject("stagedUploadsCreate",
                StagedUploadsCreatePayload.class);

        java.util.List<UserError> errors = payload.getUserErrors();
        for (UserError error : errors) {
            log.error("StagedMediaUpload: " + error.toString());
        }

        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();

        java.util.List<StagedMediaUploadTarget> targets = payload.getStagedTargets();
        for (StagedMediaUploadTarget target : targets) {
            java.net.http.HttpRequest.Builder postRequestBuilder = java.net.http.HttpRequest.newBuilder();

            java.util.List<StagedUploadParameter> params = target.getParameters();
            for (StagedUploadParameter param : params) {
                postRequestBuilder.header(param.getName(), param.getValue());
            }

            postRequestBuilder.uri(new java.net.URI(target.getUrl()));
            postRequestBuilder.PUT(java.net.http.HttpRequest.BodyPublishers.ofFile(file.toPath()));

            java.net.http.HttpResponse<String> postResponse = client.send(postRequestBuilder.build(),
                    java.net.http.HttpResponse.BodyHandlers.ofString());

            createMedia(product, target.getResourceUrl());
        }
    }

    private void createMedia(Product product, String source) {
        java.util.List<CreateMediaInput> medias = new java.util.ArrayList<>();
        CreateMediaInput media = new CreateMediaInput();
        media.setMediaContentType(MediaContentType.IMAGE);
        media.setOriginalSource(source);
        medias.add(media);

        ProductCreateMediaGraphQLQuery.Builder builder = ProductCreateMediaGraphQLQuery.newRequest();
        builder.productId(product.getId());
        builder.media(medias);
        ProductCreateMediaGraphQLQuery query = builder.build();

        ProductCreateMediaProjectionRoot root = new ProductCreateMediaProjectionRoot();
        MediaProjection projection = root.media();
        projection.__typename();
        projection.id();
        projection.mediaContentType();

        MediaUserErrorProjection userError = root.mediaUserErrors();
        userError.message();
        userError.field();

        com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest request = new com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest(
                query, root);
        log.trace("Query: " + request.serialize());

        com.netflix.graphql.dgs.client.GraphQLResponse response = client.executeQuery(request.serialize());
        log.trace("Response: " + response);

        ProductCreateMediaPayload payload = response.extractValueAsObject("productCreateMedia",
                ProductCreateMediaPayload.class);
        java.util.List<MediaUserError> errors = payload.getMediaUserErrors();
        if (errors.size() > 0) {
            log.error("Create Media Error Count: " + errors.size());
        }
    }
}
