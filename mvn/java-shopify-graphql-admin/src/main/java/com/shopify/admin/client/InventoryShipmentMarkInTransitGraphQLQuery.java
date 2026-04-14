package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Marks a draft inventory shipment as in transit.
 */
public class InventoryShipmentMarkInTransitGraphQLQuery extends GraphQLQuery {
  public InventoryShipmentMarkInTransitGraphQLQuery(String id, OffsetDateTime dateShipped,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (dateShipped != null || fieldsSet.contains("dateShipped")) {
        getInput().put("dateShipped", dateShipped);
    }
  }

  public InventoryShipmentMarkInTransitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryShipmentMarkInTransit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private OffsetDateTime dateShipped;

    private String queryName;

    public InventoryShipmentMarkInTransitGraphQLQuery build() {
      return new InventoryShipmentMarkInTransitGraphQLQuery(id, dateShipped, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory shipment to mark in transit.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The date the shipment was shipped.
     */
    public Builder dateShipped(OffsetDateTime dateShipped) {
      this.dateShipped = dateShipped;
      this.fieldsSet.add("dateShipped");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
