package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns an inventory shipment by ID.
 */
public class InventoryShipmentGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public InventoryShipmentGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipment";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public InventoryShipmentGraphQLQuery build() {
      return new InventoryShipmentGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory shipment.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
