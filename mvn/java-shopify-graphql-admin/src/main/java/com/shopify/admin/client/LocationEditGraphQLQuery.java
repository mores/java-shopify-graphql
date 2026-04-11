package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.LocationEditInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the properties of an existing [`Location`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location).
 * You can modify the location's name, address, whether it fulfills online
 * orders, and custom
 * [`metafields`](https://shopify.dev/docs/apps/build/custom-data).
 *   
 * Apps that created a [`FulfillmentService`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentService)
 * can edit the associated location to ensure accurate representation of their
 * fulfillment network.
 *   
 * > Note:
 * > You can't disable the [`fulfillsOnlineOrders`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationEdit#arguments-input.fields.fulfillsOnlineOrders)
 * setting for fulfillment service locations.
 *   
 * Learn more about [editing locations for fulfillment services](https://shopify.dev/docs/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-2-edit-locations).
 */
public class LocationEditGraphQLQuery extends GraphQLQuery {
  public LocationEditGraphQLQuery(String id, LocationEditInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public LocationEditGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationEdit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private LocationEditInput input;

    private String queryName;

    public LocationEditGraphQLQuery build() {
      return new LocationEditGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of a location to edit.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The updated properties for the location.
     */
    public Builder input(LocationEditInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
