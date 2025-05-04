package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The shop's billing preferences.
 */
public class ShopBillingPreferencesGraphQLQuery extends GraphQLQuery {
  public ShopBillingPreferencesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public ShopBillingPreferencesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shopBillingPreferences";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public ShopBillingPreferencesGraphQLQuery build() {
      return new ShopBillingPreferencesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
