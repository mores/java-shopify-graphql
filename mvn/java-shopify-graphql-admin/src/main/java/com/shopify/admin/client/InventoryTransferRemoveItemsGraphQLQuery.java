package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryTransferRemoveItemsInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * This mutation allows removing the shippable quantities of line items on a Transfer.
 * It removes all quantities of the item from the transfer that are not associated with shipments.
 */
public class InventoryTransferRemoveItemsGraphQLQuery extends GraphQLQuery {
  public InventoryTransferRemoveItemsGraphQLQuery(InventoryTransferRemoveItemsInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryTransferRemoveItemsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryTransferRemoveItems";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryTransferRemoveItemsInput input;

    private String queryName;

    public InventoryTransferRemoveItemsGraphQLQuery build() {
      return new InventoryTransferRemoveItemsGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for the InventoryTransferRemoveItems mutation.
     */
    public Builder input(InventoryTransferRemoveItemsInput input) {
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
