package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryShipmentUpdateItemQuantitiesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates items on an inventory shipment.
 */
public class InventoryShipmentUpdateItemQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentUpdateItemQuantitiesGraphQLQuery(String id,
      List<InventoryShipmentUpdateItemQuantitiesInput> items, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (items != null || fieldsSet.contains("items")) {
        getInput().put("items", items);
    }
  }

  public InventoryShipmentUpdateItemQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentUpdateItemQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<InventoryShipmentUpdateItemQuantitiesInput> items;

    private String queryName;

    public InventoryShipmentUpdateItemQuantitiesGraphQLQuery build() {
      return new InventoryShipmentUpdateItemQuantitiesGraphQLQuery(id, items, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory shipment to update item quantities.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The list of line items to be updated to the shipment.
     */
    public Builder items(List<InventoryShipmentUpdateItemQuantitiesInput> items) {
      this.items = items;
      this.fieldsSet.add("items");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
