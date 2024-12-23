package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes the Server Pixel associated with the current app & shop.
 */
public class ServerPixelDeleteGraphQLQuery extends GraphQLQuery {
  public ServerPixelDeleteGraphQLQuery(String queryName) {
    super("mutation", queryName);
  }

  public ServerPixelDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "serverPixelDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public ServerPixelDeleteGraphQLQuery build() {
      return new ServerPixelDeleteGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
