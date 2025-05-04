package com.shopify.storefront;

import com.netflix.graphql.dgs.client.CustomGraphQLClient;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import com.netflix.graphql.dgs.client.GraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.HttpResponse;

import com.shopify.storefront.client.*;
import com.shopify.storefront.types.*;

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

        String endpointUrl = "https://" + STORE + ".myshopify.com/api/2025-04/graphql.json";

        RestTemplate restTemplate = new RestTemplate();
        client = GraphQLClient.createCustom(endpointUrl, (url, headers, body) -> {

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("X-Shopify-Storefront-Access-Token", TOKEN);
            headers.forEach(httpHeaders::addAll);

            ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST,
                    new HttpEntity<>(body, httpHeaders), String.class);
            return new HttpResponse(exchange.getStatusCodeValue(), exchange.getBody());
        });

        java.util.List<ProductVariant> variants = getProductVariants();
        log.info("Number of Product Variants: " + variants.size());
        int actualNumberOfItems = Math.min(2, variants.size()); // To avoid IndexOutOfBoundsException

        java.util.Collections.shuffle(variants);
        Cart cart = createCart(variants.subList(0, actualNumberOfItems));

        java.util.Collections.shuffle(variants);
        addToCart(cart, variants.subList(0, actualNumberOfItems));
    }

    private Cart createCart(java.util.List<ProductVariant> variants) throws Exception {

        CartCreateGraphQLQuery.Builder builder = CartCreateGraphQLQuery.newRequest();

        CartInput cartInput = new CartInput();

        java.util.List<CartLineInput> lines = new java.util.ArrayList<>();
        for (ProductVariant variant : variants) {
            CartLineInput line = new CartLineInput();
            line.setQuantity(1);
            line.setMerchandiseId(variant.getId());
            lines.add(line);
        }
        cartInput.setLines(lines);
        builder.input(cartInput);

        CartCreateGraphQLQuery query = builder.build();

        CartCreateProjectionRoot root = new CartCreateProjectionRoot();
        CartProjection cartProjection = root.cart();
        cartProjection.id();
        cartProjection.checkoutUrl();

        CartUserErrorProjection userError = root.userErrors();
        userError.field();
        userError.message();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.trace("Query: " + request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.trace("Response: " + response);

        CartCreatePayload payload = response.extractValueAsObject("cartCreate", CartCreatePayload.class);
        java.util.List<CartUserError> errors = payload.getUserErrors();
        if (errors.size() > 0) {
            for (CartUserError error : errors) {
                log.error(error.getField() + "\t" + error.getMessage());
            }
            log.error(request.serialize());
        }

        log.info("Checkout URL: " + payload.getCart().getCheckoutUrl());

        return payload.getCart();
    }

    private void addToCart(Cart cart, java.util.List<ProductVariant> variants) throws Exception {

        CartLinesAddGraphQLQuery.Builder builder = CartLinesAddGraphQLQuery.newRequest();
        builder.cartId(cart.getId());
        java.util.List<CartLineInput> lines = new java.util.ArrayList<>();
        for (ProductVariant variant : variants) {

            CartLineInput line = new CartLineInput();
            line.setQuantity(1);
            line.setMerchandiseId(variant.getId());
            lines.add(line);
        }
        builder.lines(lines);
        CartLinesAddGraphQLQuery query = builder.build();

        CartLinesAddProjectionRoot root = new CartLinesAddProjectionRoot();

        CartUserErrorProjection userError = root.userErrors();
        userError.field();
        userError.message();

        GraphQLQueryRequest request = new GraphQLQueryRequest(query, root);
        log.trace("Query: " + request.serialize());
        GraphQLResponse response = client.executeQuery(request.serialize());
        log.trace("Response: " + response);
    }

    public java.util.List<ProductVariant> getProductVariants() {

        java.util.List<ProductVariant> variants = new java.util.ArrayList<>();

        java.util.List<Product> products = getProducts(null);
        for (Product product : products) {

            ProductVariantConnection productVariantConnection = product.getVariants();
            java.util.List<ProductVariantEdge> edges = productVariantConnection.getEdges();
            ProductVariantEdge firstEdge = edges.get(0);
            ProductVariant productVariant = firstEdge.getNode();

            variants.add(productVariant);
        }

        return variants;
    }

    public java.util.List<Product> getProducts(String after) {
        java.util.List<Product> rows = new java.util.ArrayList<>();

        ProductsGraphQLQuery.Builder builder = ProductsGraphQLQuery.newRequest();
        builder.first(250);
        if (after != null) {
            builder.after(after);
        }
        ProductsGraphQLQuery query = builder.build();

        ProductsProjectionRoot root = new ProductsProjectionRoot();
        ProductEdgeProjection edgeProjection = root.edges();
        ProductProjection productProjection = edgeProjection.node();
        productProjection.availableForSale();
        productProjection.id();
        productProjection.title();
        productProjection.totalInventory();

        PageInfoProjection pageInfoProjection = root.pageInfo();
        pageInfoProjection.endCursor();
        pageInfoProjection.hasNextPage();
        pageInfoProjection.startCursor();

        ProductVariantConnectionProjection variantConnectionProjection = productProjection.variants(10, null, null,
                null, null, null);
        ProductVariantEdgeProjection vEdgeProjection = variantConnectionProjection.edges();
        ProductVariantProjection variantProjection = vEdgeProjection.node();
        variantProjection.id();

        com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest request = new com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest(
                query, root);
        log.trace("Query: " + request.serialize());

        com.netflix.graphql.dgs.client.GraphQLResponse response = client.executeQuery(request.serialize());
        log.trace("Response: " + response);

        ProductConnection results = response.extractValueAsObject("products", ProductConnection.class);
        java.util.List<ProductEdge> edges = results.getEdges();
        for (ProductEdge edge : edges) {
            Product product = edge.getNode();
            log.debug("Id: " + product.getId() + "\t" + product.getAvailableForSale() + "\t"
                    + product.getTotalInventory() + "\t" + product.getTitle());
            if (product.getAvailableForSale()) {
                rows.add(product);
            }
        }

        PageInfo pageInfo = results.getPageInfo();
        if (pageInfo.getHasNextPage()) {
            rows.addAll(getProducts(pageInfo.getEndCursor()));
        }

        return rows;
    }
}
