package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryShipmentReceiveItemInput;
import com.shopify.admin.types.InventoryShipmentReceiveLineItemReason;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Receive an inventory shipment.
 */
public class InventoryShipmentReceiveGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentReceiveGraphQLQuery(String id,
      List<InventoryShipmentReceiveItemInput> lineItems,
      InventoryShipmentReceiveLineItemReason bulkReceiveAction, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItems != null || fieldsSet.contains("lineItems")) {
        getInput().put("lineItems", lineItems);
    }if (bulkReceiveAction != null || fieldsSet.contains("bulkReceiveAction")) {
        getInput().put("bulkReceiveAction", bulkReceiveAction);
    }
  }

  public InventoryShipmentReceiveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentReceive";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<InventoryShipmentReceiveItemInput> lineItems;

    private InventoryShipmentReceiveLineItemReason bulkReceiveAction;

    private String queryName;

    public InventoryShipmentReceiveGraphQLQuery build() {
      return new InventoryShipmentReceiveGraphQLQuery(id, lineItems, bulkReceiveAction, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory shipment to receive.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The list of receive line items for the inventory shipment.
     */
    public Builder lineItems(List<InventoryShipmentReceiveItemInput> lineItems) {
      this.lineItems = lineItems;
      this.fieldsSet.add("lineItems");
      return this;
    }

    /**
     * The bulk receive action for the inventory shipment.
     */
    public Builder bulkReceiveAction(InventoryShipmentReceiveLineItemReason bulkReceiveAction) {
      this.bulkReceiveAction = bulkReceiveAction;
      this.fieldsSet.add("bulkReceiveAction");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
