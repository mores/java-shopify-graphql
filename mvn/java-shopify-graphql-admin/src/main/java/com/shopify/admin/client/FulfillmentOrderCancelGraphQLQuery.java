package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Cancels a [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) and creates a replacement fulfillment order to represent the work left to be
 * done. The original fulfillment order will be marked as closed.
 *   
 * This mutation works when the fulfillment order has a `SUBMITTED` or
 * `CANCELLATION_REQUESTED` status. For `SUBMITTED` orders, cancellation happens
 * immediately because the fulfillment service hasn't accepted the request.
 *   
 * > Note: Orders that have had cancellation requested but the cancellation has
 * yet to be accepted by the fulfillment service might still have work completed
 * despite cancellation.
 */
public class FulfillmentOrderCancelGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderCancelGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public FulfillmentOrderCancelGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderCancel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public FulfillmentOrderCancelGraphQLQuery build() {
      return new FulfillmentOrderCancelGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment order to mark as canceled.
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
