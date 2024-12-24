package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentOrderLineItemInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FulfillmentOrderMoveGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderMoveGraphQLQuery(String id, String newLocationId,
      List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (newLocationId != null || fieldsSet.contains("newLocationId")) {
        getInput().put("newLocationId", newLocationId);
    }if (fulfillmentOrderLineItems != null || fieldsSet.contains("fulfillmentOrderLineItems")) {
        getInput().put("fulfillmentOrderLineItems", fulfillmentOrderLineItems);
    }
  }

  public FulfillmentOrderMoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderMove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String newLocationId;

    private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

    private String queryName;

    public FulfillmentOrderMoveGraphQLQuery build() {
      return new FulfillmentOrderMoveGraphQLQuery(id, newLocationId, fulfillmentOrderLineItems, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder newLocationId(String newLocationId) {
      this.newLocationId = newLocationId;
      this.fieldsSet.add("newLocationId");
      return this;
    }

    
    public Builder fulfillmentOrderLineItems(
        List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
      this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
      this.fieldsSet.add("fulfillmentOrderLineItems");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
