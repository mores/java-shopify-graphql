package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * List of product types for the shop's products that are published to your app.
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
