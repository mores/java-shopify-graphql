package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryProfileInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a [`DeliveryProfile`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DeliveryProfile)'s configuration, including its shipping zones, rates, and associated products.
 *   
 * Modify location groups to control which fulfillment [`Location`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
 * objects serve specific geographic areas. Add or remove shipping zones with
 * custom countries and provinces. Create or update shipping methods with rate
 * definitions and delivery conditions. Associate or dissociate [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) objects and [`SellingPlanGroup`](https://shopify.dev/docs/api/admin-graphql/latest/objects/SellingPlanGroup)
 * objects to determine which products use this profile's shipping rules.
 *   
 * The mutation supports partial updates through dedicated input fields for
 * creating, updating, and deleting specific components without affecting the
 * entire profile structure.
 *   
 * Learn more about [building delivery profiles](https://shopify.dev/docs/apps/build/purchase-options/deferred/delivery-and-deferment/build-delivery-profiles).
 */
public class DeliveryProfileUpdateGraphQLQuery extends GraphQLQuery {
  public DeliveryProfileUpdateGraphQLQuery(String id, DeliveryProfileInput profile,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (profile != null || fieldsSet.contains("profile")) {
        getInput().put("profile", profile);
    }
  }

  public DeliveryProfileUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryProfileUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DeliveryProfileInput profile;

    private String queryName;

    public DeliveryProfileUpdateGraphQLQuery build() {
      return new DeliveryProfileUpdateGraphQLQuery(id, profile, queryName, fieldsSet);
               
    }

    /**
     * The ID of the delivery profile to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
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
