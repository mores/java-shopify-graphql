package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentOrderLineItemInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Changes the location which is assigned to fulfill a number of unfulfilled fulfillment order line items.
 *   
 * Moving a fulfillment order will fail in the following circumstances:
 *   
 * * The fulfillment order is closed.
 * * The destination location has never stocked the requested inventory item.
 * * The API client doesn't have the correct permissions.
 *   
 * Line items which have already been fulfilled can't be re-assigned
 * and will always remain assigned to the original location.
 *   
 * You can't change the assigned location while a fulfillment order has a
 * [request status](https://shopify.dev/docs/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus)
 * of `SUBMITTED`, `ACCEPTED`, `CANCELLATION_REQUESTED`, or `CANCELLATION_REJECTED`.
 * These request statuses mean that a fulfillment order is awaiting action by a fulfillment service
 * and can't be re-assigned without first having the fulfillment service accept a cancellation request.
 * This behavior is intended to prevent items from being fulfilled by multiple locations or fulfillment services.
 *   
 * ### How re-assigning line items affects fulfillment orders
 *   
 * **First scenario:** Re-assign all line items belonging to a fulfillment order to a new location.
 *   
 * In this case, the
 * [assignedLocation](https://shopify.dev/docs/api/admin-graphql/latest/objects/fulfillmentorder#field-fulfillmentorder-assignedlocation)
 * of the original fulfillment order will be updated to the new location.
 *   
 * **Second scenario:** Re-assign a subset of the line items belonging to a fulfillment order to a new location.
 * You can specify a subset of line items using the `fulfillmentOrderLineItems` parameter
 * (available as of the `2023-04` API version),
 * or specify that the original fulfillment order contains line items which have already been fulfilled.
 *   
 * If the new location is already assigned to another active fulfillment order, on the same order, then
 * a new fulfillment order is created. The existing fulfillment order is closed and line items are recreated
 * in a new fulfillment order.
 */
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

    /**
     * The ID of the fulfillment order to be moved.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the location where the fulfillment order will be moved.
     */
    public Builder newLocationId(String newLocationId) {
      this.newLocationId = newLocationId;
      this.fieldsSet.add("newLocationId");
      return this;
    }

    /**
     * The fulfillment order line items to be moved.
     * If left blank, all unfulfilled line items belonging to the fulfillment order are moved.
     */
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
