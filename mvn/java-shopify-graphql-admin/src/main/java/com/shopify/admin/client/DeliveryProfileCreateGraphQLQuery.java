package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryProfileInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`DeliveryProfile`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DeliveryProfile) that defines shipping rates for specific products and locations.
 *   
 * A delivery profile groups products with their shipping zones and rates. You
 * can associate profiles with [`SellingPlanGroup`](https://shopify.dev/docs/api/admin-graphql/latest/objects/SellingPlanGroup)
 * objects to customize shipping for subscriptions and pre-orders. Each profile contains [`DeliveryProfileLocationGroup`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DeliveryProfileLocationGroup)
 * objects that specify which [`Location`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
 * objects ship to which [`DeliveryZone`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DeliveryZone)
 * objects with specific [`DeliveryMethodDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DeliveryMethodDefinition)
 * objects and rates.
 *   
 * Learn more about [building delivery profiles](https://shopify.dev/docs/apps/build/purchase-options/deferred/delivery-and-deferment/build-delivery-profiles).
 */
public class DeliveryProfileCreateGraphQLQuery extends GraphQLQuery {
  public DeliveryProfileCreateGraphQLQuery(DeliveryProfileInput profile, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (profile != null || fieldsSet.contains("profile")) {
        getInput().put("profile", profile);
    }
  }

  public DeliveryProfileCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryProfileCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DeliveryProfileInput profile;

    private String queryName;

    public DeliveryProfileCreateGraphQLQuery build() {
      return new DeliveryProfileCreateGraphQLQuery(profile, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields for a delivery profile.
     */
    public Builder profile(DeliveryProfileInput profile) {
      this.profile = profile;
      this.fieldsSet.add("profile");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
