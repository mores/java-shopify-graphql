package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a Shopify Function by its ID.
 * [Functions](https://shopify.dev/apps/build/functions)
 * enable you to customize Shopify's backend logic at defined parts of the commerce loop.
 */
public class ShopifyFunctionGraphQLQuery extends GraphQLQuery {
  public ShopifyFunctionGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ShopifyFunctionGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shopifyFunction";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ShopifyFunctionGraphQLQuery build() {
      return new ShopifyFunctionGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the Shopify Function.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
