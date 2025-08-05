package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryShipmentCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds an in-transit shipment to an inventory transfer.
 */
public class InventoryShipmentCreateInTransitGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentCreateInTransitGraphQLQuery(InventoryShipmentCreateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryShipmentCreateInTransitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentCreateInTransit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryShipmentCreateInput input;

    private String queryName;

    public InventoryShipmentCreateInTransitGraphQLQuery build() {
      return new InventoryShipmentCreateInTransitGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for the inventory shipment.
     */
    public Builder input(InventoryShipmentCreateInput input) {
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
