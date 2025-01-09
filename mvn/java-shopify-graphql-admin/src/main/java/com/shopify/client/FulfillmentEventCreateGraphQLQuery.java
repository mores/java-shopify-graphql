package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentEventInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a fulfillment event for a specified fulfillment.
 */
public class FulfillmentEventCreateGraphQLQuery extends GraphQLQuery {
  public FulfillmentEventCreateGraphQLQuery(FulfillmentEventInput fulfillmentEvent,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentEvent != null || fieldsSet.contains("fulfillmentEvent")) {
        getInput().put("fulfillmentEvent", fulfillmentEvent);
    }
  }

  public FulfillmentEventCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentEventCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private FulfillmentEventInput fulfillmentEvent;

    private String queryName;

    public FulfillmentEventCreateGraphQLQuery build() {
      return new FulfillmentEventCreateGraphQLQuery(fulfillmentEvent, queryName, fieldsSet);
               
    }

    /**
     * The input fields used to create a fulfillment event for a fulfillment.
     */
    public Builder fulfillmentEvent(FulfillmentEventInput fulfillmentEvent) {
      this.fulfillmentEvent = fulfillmentEvent;
      this.fieldsSet.add("fulfillmentEvent");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
