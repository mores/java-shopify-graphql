package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryShipmentTrackingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Edits the tracking info on an inventory shipment.
 */
public class InventoryShipmentSetTrackingGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentSetTrackingGraphQLQuery(String id,
      InventoryShipmentTrackingInput tracking, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (tracking != null || fieldsSet.contains("tracking")) {
        getInput().put("tracking", tracking);
    }
  }

  public InventoryShipmentSetTrackingGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentSetTracking";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private InventoryShipmentTrackingInput tracking;

    private String queryName;

    public InventoryShipmentSetTrackingGraphQLQuery build() {
      return new InventoryShipmentSetTrackingGraphQLQuery(id, tracking, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory shipment whose tracking info is being edited.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The tracking info to edit on the inventory shipment.
     */
    public Builder tracking(InventoryShipmentTrackingInput tracking) {
      this.tracking = tracking;
      this.fieldsSet.add("tracking");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
