package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [`DeliveryProfile`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DeliveryProfile) by ID. Delivery profiles group shipping settings for specific
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * objects that ship from selected [`Location`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
 * objects to [delivery
 * zones](https://shopify.dev/docs/api/admin-graphql/latest/objects/DeliveryZone
 * with defined rates.
 *   
 * Learn more about [delivery profiles](https://shopify.dev/docs/apps/build/purchase-options/deferred/delivery-and-deferment#whats-a-delivery-profile).
 */
public class DeliveryProfileGraphQLQuery extends GraphQLQuery {
  public DeliveryProfileGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DeliveryProfileGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "deliveryProfile";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DeliveryProfileGraphQLQuery build() {
      return new DeliveryProfileGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the DeliveryProfile to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
