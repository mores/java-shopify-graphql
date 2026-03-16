package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Remove items from an inventory shipment.
 */
public class InventoryShipmentRemoveItemsGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentRemoveItemsGraphQLQuery(String id, List<String> lineItems,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItems != null || fieldsSet.contains("lineItems")) {
        getInput().put("lineItems", lineItems);
    }
  }

  public InventoryShipmentRemoveItemsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentRemoveItems";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> lineItems;

    private String queryName;

    public InventoryShipmentRemoveItemsGraphQLQuery build() {
      return new InventoryShipmentRemoveItemsGraphQLQuery(id, lineItems, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory shipment to remove items from.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * A list of inventory shipment line item ids representing the items to be removed from the shipment.
     */
    public Builder lineItems(List<String> lineItems) {
      this.lineItems = lineItems;
      this.fieldsSet.add("lineItems");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
