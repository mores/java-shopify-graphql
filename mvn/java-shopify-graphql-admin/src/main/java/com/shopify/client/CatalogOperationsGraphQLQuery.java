package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CatalogOperationsGraphQLQuery extends GraphQLQuery {
  public CatalogOperationsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public CatalogOperationsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "catalogOperations";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public CatalogOperationsGraphQLQuery build() {
      return new CatalogOperationsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
