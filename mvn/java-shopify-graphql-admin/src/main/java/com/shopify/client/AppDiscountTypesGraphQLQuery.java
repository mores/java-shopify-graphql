package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * A list of app discount types installed by apps.
 */
public class AppDiscountTypesGraphQLQuery extends GraphQLQuery {
  public AppDiscountTypesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public AppDiscountTypesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appDiscountTypes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public AppDiscountTypesGraphQLQuery build() {
      return new AppDiscountTypesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
