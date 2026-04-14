package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Set the delivery settings for a shop.
 */
public class DeliverySettingUpdateGraphQLQuery extends GraphQLQuery {
  public DeliverySettingUpdateGraphQLQuery(String queryName) {
    super("mutation", queryName);
  }

  public DeliverySettingUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliverySettingUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public DeliverySettingUpdateGraphQLQuery build() {
      return new DeliverySettingUpdateGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
