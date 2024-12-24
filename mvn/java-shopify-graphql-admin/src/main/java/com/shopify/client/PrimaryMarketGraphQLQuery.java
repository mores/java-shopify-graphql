package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PrimaryMarketGraphQLQuery extends GraphQLQuery {
  public PrimaryMarketGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public PrimaryMarketGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "primaryMarket";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public PrimaryMarketGraphQLQuery build() {
      return new PrimaryMarketGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
