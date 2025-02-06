package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes an order. For more information on which orders can be deleted, refer to [Delete an order](https://help.shopify.com/manual/orders/cancel-delete-order#delete-an-order).
 */
public class OrderDeleteGraphQLQuery extends GraphQLQuery {
  public OrderDeleteGraphQLQuery(String orderId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }
  }

  public OrderDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String orderId;

    private String queryName;

    public OrderDeleteGraphQLQuery build() {
      return new OrderDeleteGraphQLQuery(orderId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the order to be deleted.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      this.fieldsSet.add("orderId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
