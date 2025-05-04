package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The configuration for the shop's gift cards.
 */
public class GiftCardConfigurationGraphQLQuery extends GraphQLQuery {
  public GiftCardConfigurationGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public GiftCardConfigurationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "giftCardConfiguration";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public GiftCardConfigurationGraphQLQuery build() {
      return new GiftCardConfigurationGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
