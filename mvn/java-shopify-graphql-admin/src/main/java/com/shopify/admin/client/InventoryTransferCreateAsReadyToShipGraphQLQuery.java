package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryTransferCreateAsReadyToShipInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates an inventory transfer in ready to ship.
 */
public class InventoryTransferCreateAsReadyToShipGraphQLQuery extends GraphQLQuery {
  public InventoryTransferCreateAsReadyToShipGraphQLQuery(
      InventoryTransferCreateAsReadyToShipInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryTransferCreateAsReadyToShipGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryTransferCreateAsReadyToShip";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryTransferCreateAsReadyToShipInput input;

    private String queryName;

    public InventoryTransferCreateAsReadyToShipGraphQLQuery build() {
      return new InventoryTransferCreateAsReadyToShipGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for the inventory transfer.
     */
    public Builder input(InventoryTransferCreateAsReadyToShipInput input) {
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
