package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class InventoryActivateGraphQLQuery extends GraphQLQuery {
  public InventoryActivateGraphQLQuery(String inventoryItemId, String locationId, Integer available,
      Integer onHand, Boolean stockAtLegacyLocation, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (inventoryItemId != null || fieldsSet.contains("inventoryItemId")) {
        getInput().put("inventoryItemId", inventoryItemId);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (available != null || fieldsSet.contains("available")) {
        getInput().put("available", available);
    }if (onHand != null || fieldsSet.contains("onHand")) {
        getInput().put("onHand", onHand);
    }if (stockAtLegacyLocation != null || fieldsSet.contains("stockAtLegacyLocation")) {
        getInput().put("stockAtLegacyLocation", stockAtLegacyLocation);
    }
  }

  public InventoryActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String inventoryItemId;

    private String locationId;

    private Integer available;

    private Integer onHand;

    private Boolean stockAtLegacyLocation;

    private String queryName;

    public InventoryActivateGraphQLQuery build() {
      return new InventoryActivateGraphQLQuery(inventoryItemId, locationId, available, onHand, stockAtLegacyLocation, queryName, fieldsSet);
               
    }

    
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      this.fieldsSet.add("inventoryItemId");
      return this;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    
    public Builder available(Integer available) {
      this.available = available;
      this.fieldsSet.add("available");
      return this;
    }

    
    public Builder onHand(Integer onHand) {
      this.onHand = onHand;
      this.fieldsSet.add("onHand");
      return this;
    }

    
    public Builder stockAtLegacyLocation(Boolean stockAtLegacyLocation) {
      this.stockAtLegacyLocation = stockAtLegacyLocation;
      this.fieldsSet.add("stockAtLegacyLocation");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
