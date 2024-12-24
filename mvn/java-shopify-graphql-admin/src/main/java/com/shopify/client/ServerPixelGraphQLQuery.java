package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ServerPixelGraphQLQuery extends GraphQLQuery {
  public ServerPixelGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public ServerPixelGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "serverPixel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public ServerPixelGraphQLQuery build() {
      return new ServerPixelGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
