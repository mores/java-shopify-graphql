package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents the delivery promise settings for a shop.
 */
public class DeliveryPromiseSettingsGraphQLQuery extends GraphQLQuery {
  public DeliveryPromiseSettingsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public DeliveryPromiseSettingsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "deliveryPromiseSettings";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public DeliveryPromiseSettingsGraphQLQuery build() {
      return new DeliveryPromiseSettingsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
