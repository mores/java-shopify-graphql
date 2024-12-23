package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.StorefrontAccessTokenInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a storefront access token for use with the [Storefront API](https://shopify.dev/docs/api/storefront).
 *   
 * An app can have a maximum of 100 active storefront access tokens for each shop.
 *   
 * [Get started with the Storefront API](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/getting-started).
 */
public class StorefrontAccessTokenCreateGraphQLQuery extends GraphQLQuery {
  public StorefrontAccessTokenCreateGraphQLQuery(StorefrontAccessTokenInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public StorefrontAccessTokenCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "storefrontAccessTokenCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private StorefrontAccessTokenInput input;

    private String queryName;

    public StorefrontAccessTokenCreateGraphQLQuery build() {
      return new StorefrontAccessTokenCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Provides the input fields for creating a storefront access token.
     */
    public Builder input(StorefrontAccessTokenInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
