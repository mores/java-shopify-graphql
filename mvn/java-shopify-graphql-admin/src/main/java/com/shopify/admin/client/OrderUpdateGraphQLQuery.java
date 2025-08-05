package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the attributes of an order, such as the customer's email, the shipping address for the order,
 * tags, and [metafields](https://shopify.dev/docs/apps/build/custom-data) associated with the order.
 *   
 * If you need to make significant updates to an order, such as adding or removing line items, changing
 * quantities, or modifying discounts, then use
 * the [`orderEditBegin`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditBegin)
 * mutation instead. The `orderEditBegin` mutation initiates an order editing session,
 * allowing you to make multiple changes before finalizing them. Learn more about using the `orderEditBegin`
 * mutation to [edit existing orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
 *   
 * If you need to remove a customer from an order, then use the [`orderCustomerRemove`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderCustomerRemove)
 * mutation instead.
 *   
 * Learn how to build apps that integrate with
 * [order management and fulfillment processes](https://shopify.dev/docs/apps/build/orders-fulfillment).
 */
public class OrderUpdateGraphQLQuery extends GraphQLQuery {
  public OrderUpdateGraphQLQuery(OrderInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderInput input;

    private String queryName;

    public OrderUpdateGraphQLQuery build() {
      return new OrderUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The attributes of the updated order.
     */
    public Builder input(OrderInput input) {
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
