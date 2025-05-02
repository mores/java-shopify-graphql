package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the localized experiences configured for the shop.
 */
public class LocalizationGraphQLQuery extends GraphQLQuery {
  public LocalizationGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public LocalizationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "localization";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public LocalizationGraphQLQuery build() {
      return new LocalizationGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
