package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ServerPixelCreateGraphQLQuery extends GraphQLQuery {
  public ServerPixelCreateGraphQLQuery(String queryName) {
    super("mutation", queryName);
  }

  public ServerPixelCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "serverPixelCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public ServerPixelCreateGraphQLQuery build() {
      return new ServerPixelCreateGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
