package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentEventInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`FulfillmentEvent`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentEvent) to track the shipment status and location of items that have shipped. Events
 * capture status updates like carrier pickup, in transit, out for delivery, or delivered.
 *   
 * Each event records the timestamp and current status of the [`Fulfillment`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Fulfillment).
 * You can include optional details such as the location where the event
 * occurred, estimated arrival time, and messages for tracking purposes.
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
