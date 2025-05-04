package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the Shop resource corresponding to the access token used in the request. The Shop resource contains
 * business and store management settings for the shop.
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
