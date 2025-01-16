package com.shopify;

import com.netflix.graphql.dgs.client.CustomGraphQLClient;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import com.netflix.graphql.dgs.client.GraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.HttpResponse;

import com.shopify.client.*;
import com.shopify.types.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import org.junit.Test;

public class AppTest {
    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AppTest.class);

    private static final String STORE = "<insert you store name here>";
    private static final String TOKEN = "<insert your token here>";

    private CustomGraphQLClient client;

    @Test
    public void testOne() throws Exception {
        log.info("testOne");

        String endpointUrl = "https://" + STORE + ".myshopify.com/admin/api/2025-01/graphql.json";

        RestTemplate restTemplate = new RestTemplate();
        client = GraphQLClient.createCustom(endpointUrl, (url, headers, body) -> {

            HttpHeaders httpHeaders = new HttpHeaders();
            headers.forEach(httpHeaders::addAll);
            httpHeaders.add("X-Shopify-Access-Token", TOKEN);

            ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST,
                    new HttpEntity<>(body, httpHeaders), String.class);
            return new HttpResponse(exchange.getStatusCodeValue(), exchange.getBody());
        });

        listProducts(null);
        createProductAdvanced();
        createProduct();
        listProducts(null);
    }

    private void listProducts(String after) {
        ProductsGraphQLQuery.Builder builder = ProductsGraphQLQuery.newRequest();
        if (after != null) {
            builder.after(after);
        }
        builder.first(250);
        ProductsGraphQLQuery productsQuery = builder.build();

        ProductsProjectionRoot root = new ProductsProjectionRoot();
        ProductEdgeProjection edgeProjection = root.edges();
        ProductProjection productProjection = edgeProjection.node();
        productProjection.id();
        productProjection.tags();

        ProductVariantConnectionProjection variantConnectionProjection = productProjection.variants(10, null, null,
                null, null, null);
        ProductVariantEdgeProjection vEdgeProjection = variantConnectionProjection.edges();
        ProductVariantProjection variantProjection = vEdgeProjection.node();
        variantProjection.barcode();
        variantProjection.id();
        variantProjection.price();
        variantProjection.sku();

        PageInfoProjection pageInfoProjection = root.pageInfo();
        pageInfoProjection.endCursor();
        pageInfoProjection.hasNextPage();
        pageInfoProjection.startCursor();

        GraphQLQueryRequest request = new GraphQLQueryRequest(productsQuery, root);

        GraphQLResponse graphQLResponse = client.executeQuery(request.serialize());
        ProductConnection results = graphQLResponse.extractValueAsObject("products", ProductConnection.class);

        java.util.List<ProductEdge> edges = results.getEdges();
        for (ProductEdge edge : edges) {
            Product product = edge.getNode();
            log.info("Id: " + product.getId() + "\t" + product.getTags());

            ProductVariantConnection variants = product.getVariants();
            java.util.List<ProductVariantEdge> vEdges = variants.getEdges();
            for (ProductVariantEdge vEdge : vEdges) {
                ProductVariant variant = vEdge.getNode();
                log.info("\t" + variant.getPrice() + "\t" + variant.getId() + "\t" + variant.getBarcode() + "\t"
                        + variant.getSku());
            }
        }

        PageInfo pageInfo = results.getPageInfo();
        if (pageInfo.getHasNextPage()) {
            listProducts(pageInfo.getEndCursor());
        }
    }

    // simpler option for initial product creation
    private void createProduct() throws Exception {
        ProductCreateGraphQLQuery.Builder builder = ProductCreateGraphQLQuery.newRequest();
        ProductCreateInput productInput = new ProductCreateInput();
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
        productInput.setTitle("Lollipops");
        builder.product(productInput);
        ProductCreateGraphQLQuery createQuery = builder.build();

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

        com.shopify.client.UserErrorProjection userError = root.userErrors();
        userError.message();
        userError.field();

        GraphQLQueryRequest request = new GraphQLQueryRequest(createQuery, root);
        GraphQLResponse productCreateResponse = client.executeQuery(request.serialize());

        ProductCreatePayload payload = productCreateResponse.extractValueAsObject("productCreate",
                ProductCreatePayload.class);
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

        updateVariant(product, variant, "3.45");
        createVariants(product);

        java.io.File file = new java.io.File("src/test/resources/lollipops.jpg");
        uploadImage(product, file);
    }

    private void createProductAdvanced() throws Exception {

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
        productSetInput.setTitle("Lollipops - Advanced");

        java.util.List<ProductVariantSetInput> variants = new java.util.ArrayList<>();

        java.util.List<VariantOptionValueInput> optionValues200 = new java.util.ArrayList<>();
        VariantOptionValueInput optionValue200 = new VariantOptionValueInput();
        optionValue200.setName("200");
        optionValue200.setOptionName("Size");
        optionValues200.add(optionValue200);

        ProductVariantSetInput variant1 = new ProductVariantSetInput();
        variant1.setOptionValues(optionValues200);
        variant1.setBarcode("8410031950656");
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
        variant2.setPrice("3.45");
        variant2.setSku("loli100");
        variants.add(variant2);

        productSetInput.setVariants(variants);
        builder.input(productSetInput);
        ProductSetGraphQLQuery createQuery = builder.build();

        // fields we would like returned
        ProductSetProjectionRoot root = new ProductSetProjectionRoot();
        ProductProjection productProjection = root.product();
        productProjection.id();

        ProductVariantConnectionProjection variantConnectionProjection = productProjection.variants(10, null, null,
                null, null, null);
        ProductVariantEdgeProjection vEdgeProjection = variantConnectionProjection.edges();
        ProductVariantProjection variantProjection = vEdgeProjection.node();
        variantProjection.id();
        variantProjection.price();

        com.shopify.client.ProductSetUserErrorProjection userError = root.userErrors();
        userError.message();
        userError.field();

        GraphQLQueryRequest request = new GraphQLQueryRequest(createQuery, root);
        log.debug("request:" + request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.debug("response: " + response);

        ProductSetPayload payload = response.extractValueAsObject("productSet", ProductSetPayload.class);
        Product product = payload.getProduct();
        java.util.List<ProductSetUserError> errors = payload.getUserErrors();
        for (ProductSetUserError error : errors) {
            log.error("Error: " + error.toString());
        }

        log.info("Created new product with Id: " + product.getId());

        java.io.File file = new java.io.File("src/test/resources/lollipops.jpg");
        uploadImage(product, file);
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

    private void updateVariant(Product product, ProductVariant productVariant, String price) {
        java.util.List<ProductVariantsBulkInput> variants = new java.util.ArrayList();
        ProductVariantsBulkInput variant = new ProductVariantsBulkInput();
        variant.setBarcode("8410031950656");
        variant.setId(productVariant.getId());
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

        java.util.List<com.shopify.types.ProductVariantsBulkUpdateUserError> errors = payload.getUserErrors();
        if (errors.size() > 0) {
            log.error("Variant Error Count: " + errors.size());
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
