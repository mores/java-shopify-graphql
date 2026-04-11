package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryBulkToggleActivationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Activates or deactivates an inventory item at multiple locations. When you activate an [`InventoryItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem) at a [`Location`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location),
 * that location can stock and track quantities for that item. When you
 * deactivate an inventory item at a location, the inventory item is no longer
 * stocked at that location.
 *   
 * The mutation accepts an inventory item ID and a list of location-specific
 * activation settings. It returns the updated inventory item and any activated [`InventoryLevel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel) objects.
 *   
 * Learn more about [managing inventory quantities and states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#inventory-object-relationships).
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
