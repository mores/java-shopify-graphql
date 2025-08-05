package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryShipmentCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds a draft shipment to an inventory transfer.
 */
public class InventoryShipmentCreateGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentCreateGraphQLQuery(InventoryShipmentCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryShipmentCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryShipmentCreateInput input;

    private String queryName;

    public InventoryShipmentCreateGraphQLQuery build() {
      return new InventoryShipmentCreateGraphQLQuery(input, queryName, fieldsSet);
               
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
