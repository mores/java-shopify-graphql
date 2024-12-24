package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentOrderLineItemsPreparedForPickupInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery(
      FulfillmentOrderLineItemsPreparedForPickupInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderLineItemsPreparedForPickup";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private FulfillmentOrderLineItemsPreparedForPickupInput input;

    private String queryName;

    public FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery build() {
      return new FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(FulfillmentOrderLineItemsPreparedForPickupInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
