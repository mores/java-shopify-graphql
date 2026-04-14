package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sets the barcode on an inventory shipment.
 */
public class InventoryShipmentSetBarcodeGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentSetBarcodeGraphQLQuery(String id, String barcode, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (barcode != null || fieldsSet.contains("barcode")) {
        getInput().put("barcode", barcode);
    }
  }

  public InventoryShipmentSetBarcodeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentSetBarcode";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String barcode;

    private String queryName;

    public InventoryShipmentSetBarcodeGraphQLQuery build() {
      return new InventoryShipmentSetBarcodeGraphQLQuery(id, barcode, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory shipment to set the barcode on.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * A unique barcode for the shipment.
     */
    public Builder barcode(String barcode) {
      this.barcode = barcode;
      this.fieldsSet.add("barcode");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
