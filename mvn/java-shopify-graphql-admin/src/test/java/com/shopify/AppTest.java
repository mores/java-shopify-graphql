package com.shopify;

import com.netflix.graphql.dgs.client.CustomGraphQLClient;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import com.netflix.graphql.dgs.client.GraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.HttpResponse;

import com.shopify.client.ProductCreateGraphQLQuery;
import com.shopify.client.ProductCreateProjectionRoot;
import com.shopify.client.ProductEdgeProjection;
import com.shopify.client.ProductProjection;
import com.shopify.client.ProductsGraphQLQuery;
import com.shopify.client.ProductsProjectionRoot;

import com.shopify.types.Product;
import com.shopify.types.ProductConnection;
import com.shopify.types.ProductCreateInput;
import com.shopify.types.ProductCreatePayload;
import com.shopify.types.ProductEdge;

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

        listProducts();
        createProduct();
        listProducts();
    }

    private void listProducts() {
        ProductsGraphQLQuery.Builder builder = ProductsGraphQLQuery.newRequest();
        builder.first(10);
        ProductsGraphQLQuery productsQuery = builder.build();

        ProductsProjectionRoot root = new ProductsProjectionRoot();
        ProductEdgeProjection edgeProjection = root.edges();
        ProductProjection productProjection = edgeProjection.node();
        productProjection.id();

        GraphQLQueryRequest request = new GraphQLQueryRequest(productsQuery, root);

        GraphQLResponse graphQLResponse = client.executeQuery(request.serialize());
        ProductConnection results = graphQLResponse.extractValueAsObject("products", ProductConnection.class);

        java.util.List<ProductEdge> edges = results.getEdges();
        for (ProductEdge edge : edges) {
            Product product = edge.getNode();
            log.info("Id: " + product.getId());
        }
    }

    private void createProduct() {
        ProductCreateGraphQLQuery.Builder builder = ProductCreateGraphQLQuery.newRequest();
        ProductCreateInput productInput = new ProductCreateInput();
        productInput.setTitle("Hiking Boots");
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
    }
}
