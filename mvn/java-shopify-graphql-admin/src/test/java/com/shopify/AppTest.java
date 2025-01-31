package com.shopify;

import com.netflix.graphql.dgs.client.CustomGraphQLClient;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import com.netflix.graphql.dgs.client.GraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.HttpResponse;

import com.shopify.client.MediaProjection;
import com.shopify.client.MediaUserErrorProjection;
import com.shopify.client.PageInfoProjection;
import com.shopify.client.ProductCreateGraphQLQuery;
import com.shopify.client.ProductCreateMediaGraphQLQuery;
import com.shopify.client.ProductCreateMediaProjectionRoot;
import com.shopify.client.ProductCreateProjectionRoot;
import com.shopify.client.ProductEdgeProjection;
import com.shopify.client.ProductProjection;
import com.shopify.client.ProductsGraphQLQuery;
import com.shopify.client.ProductsProjectionRoot;
import com.shopify.client.StagedMediaUploadTargetProjection;
import com.shopify.client.StagedUploadParameterProjection;
import com.shopify.client.StagedUploadsCreateGraphQLQuery;
import com.shopify.client.StagedUploadsCreateProjectionRoot;
import com.shopify.client.UserErrorProjection;

import com.shopify.types.CreateMediaInput;
import com.shopify.types.MediaContentType;
import com.shopify.types.MediaUserError;
import com.shopify.types.PageInfo;
import com.shopify.types.Product;
import com.shopify.types.ProductConnection;
import com.shopify.types.ProductCreateInput;
import com.shopify.types.ProductCreateMediaPayload;
import com.shopify.types.ProductCreatePayload;
import com.shopify.types.ProductEdge;
import com.shopify.types.StagedMediaUploadTarget;
import com.shopify.types.StagedUploadHttpMethodType;
import com.shopify.types.StagedUploadInput;
import com.shopify.types.StagedUploadParameter;
import com.shopify.types.StagedUploadsCreatePayload;
import com.shopify.types.StagedUploadTargetGenerateUploadResource;
import com.shopify.types.UserError;

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

        String endpointUrl = "https://" + STORE + ".myshopify.com/admin/api/2024-10/graphql.json";

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
            log.info("Id: " + product.getId());
        }

        PageInfo pageInfo = results.getPageInfo();
        if (pageInfo.getHasNextPage()) {
            listProducts(pageInfo.getEndCursor());
        }
    }

    private void createProduct() throws Exception {
        ProductCreateGraphQLQuery.Builder builder = ProductCreateGraphQLQuery.newRequest();
        ProductCreateInput productInput = new ProductCreateInput();
        productInput.setTitle("Lollipops");
        builder.product(productInput);
        ProductCreateGraphQLQuery createQuery = builder.build();

        // fields we would like returned
        ProductCreateProjectionRoot root = new ProductCreateProjectionRoot();
        ProductProjection productProjection = root.product();
        productProjection.id();

        com.shopify.client.UserErrorProjection userError = root.userErrors();
        userError.message();
        userError.field();

        GraphQLQueryRequest request = new GraphQLQueryRequest(createQuery, root);
        GraphQLResponse productCreateResponse = client.executeQuery(request.serialize());

        ProductCreatePayload results = productCreateResponse.extractValueAsObject("productCreate",
                ProductCreatePayload.class);
        Product product = results.getProduct();
        log.info("Created new product with Id: " + product.getId());

        java.io.File file = new java.io.File("src/test/resources/lollipops.jpg");
        uploadImage(product, file);
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
