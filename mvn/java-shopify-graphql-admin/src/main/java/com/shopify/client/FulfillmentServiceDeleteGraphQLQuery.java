package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentServiceDeleteInventoryAction;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class FulfillmentServiceDeleteGraphQLQuery extends GraphQLQuery {
  public FulfillmentServiceDeleteGraphQLQuery(String id, String destinationLocationId,
      FulfillmentServiceDeleteInventoryAction inventoryAction, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (destinationLocationId != null || fieldsSet.contains("destinationLocationId")) {
        getInput().put("destinationLocationId", destinationLocationId);
    }if (inventoryAction != null || fieldsSet.contains("inventoryAction")) {
        getInput().put("inventoryAction", inventoryAction);
    }
  }

  public FulfillmentServiceDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentServiceDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String destinationLocationId;

    private FulfillmentServiceDeleteInventoryAction inventoryAction;

    private String queryName;

    public FulfillmentServiceDeleteGraphQLQuery build() {
      return new FulfillmentServiceDeleteGraphQLQuery(id, destinationLocationId, inventoryAction, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder destinationLocationId(String destinationLocationId) {
      this.destinationLocationId = destinationLocationId;
      this.fieldsSet.add("destinationLocationId");
      return this;
    }

    
    public Builder inventoryAction(FulfillmentServiceDeleteInventoryAction inventoryAction) {
      this.inventoryAction = inventoryAction;
      this.fieldsSet.add("inventoryAction");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
