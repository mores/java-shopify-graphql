package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The shop associated with the storefront access token.
 */
public class ShopGraphQLQuery extends GraphQLQuery {
  public ShopGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public ShopGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shop";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public ShopGraphQLQuery build() {
      return new ShopGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
