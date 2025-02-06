package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.InventoryBulkToggleActivationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Modify the activation status of an inventory item at locations. Activating an
 * inventory item at a particular location allows that location to stock that
 * inventory item. Deactivating an inventory item at a location removes the
 * inventory item's quantities and turns off the inventory item from that location.
 */
public class InventoryBulkToggleActivationGraphQLQuery extends GraphQLQuery {
  public InventoryBulkToggleActivationGraphQLQuery(String inventoryItemId,
      List<InventoryBulkToggleActivationInput> inventoryItemUpdates, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (inventoryItemId != null || fieldsSet.contains("inventoryItemId")) {
        getInput().put("inventoryItemId", inventoryItemId);
    }if (inventoryItemUpdates != null || fieldsSet.contains("inventoryItemUpdates")) {
        getInput().put("inventoryItemUpdates", inventoryItemUpdates);
    }
  }

  public InventoryBulkToggleActivationGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryBulkToggleActivation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String inventoryItemId;

    private List<InventoryBulkToggleActivationInput> inventoryItemUpdates;

    private String queryName;

    public InventoryBulkToggleActivationGraphQLQuery build() {
      return new InventoryBulkToggleActivationGraphQLQuery(inventoryItemId, inventoryItemUpdates, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory item to modify the activation status locations for.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      this.fieldsSet.add("inventoryItemId");
      return this;
    }

    /**
     * A list of pairs of locations and activate status to update for the specified inventory item.
     */
    public Builder inventoryItemUpdates(
        List<InventoryBulkToggleActivationInput> inventoryItemUpdates) {
      this.inventoryItemUpdates = inventoryItemUpdates;
      this.fieldsSet.add("inventoryItemUpdates");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
