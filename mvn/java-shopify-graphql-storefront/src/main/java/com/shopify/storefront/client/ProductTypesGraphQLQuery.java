package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of product types from the shop's
 * [`Product`](https://shopify.dev/docs/api/storefront/current/objects/Product)
 * objects that are published to your app. Use this query to build [filtering interfaces](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/products-collections/filter-products)
 * or navigation menus based on product categorization.
 */
public class ProductTypesGraphQLQuery extends GraphQLQuery {
  public ProductTypesGraphQLQuery(int first, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    getInput().put("first", first);                   
  }

  public ProductTypesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productTypes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private int first;

    private String queryName;

    public ProductTypesGraphQLQuery build() {
      return new ProductTypesGraphQLQuery(first, queryName, fieldsSet);
               
    }

    /**
     * Returns up to the first `n` elements from the list.
     */
    public Builder first(int first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
