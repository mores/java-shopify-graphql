package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderCreateOptionsInput;
import com.shopify.admin.types.OrderCreateOrderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates an order with attributes such as customer information, line items, and shipping and billing addresses.
 *   
 * Use the `orderCreate` mutation to programmatically generate orders in scenarios where
 * orders aren't created through the standard checkout process, such as when importing orders from an external
 * system or creating orders for wholesale customers.
 *   
 * The `orderCreate` mutation doesn't support applying multiple discounts, such as discounts on line items.
 * Automatic discounts won't be applied unless you replicate the logic of those discounts in your custom
 * implementation. You can [apply a discount code](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/OrderCreateDiscountCodeInput),
 * but only one discount code can be set for each order.
 *   
 * > Note:
 * > If you're using the `orderCreate` mutation with a
 * > [trial](https://help.shopify.com/manual/intro-to-shopify/pricing-plans/free-trial) or
 * > [development store](https://shopify.dev/docs/api/development-stores), then you can create a
 * > maximum of five new orders per minute.
 *   
 * After you create an order, you can make subsequent edits to the order using one of the following mutations:
 * * [`orderUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderUpdate):
 * Used for simple updates to an order, such as changing the order's note, tags, or customer information.
 * * [`orderEditBegin`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditBegin):
 * Used when you need to make significant updates to an order, such as adding or removing line items, changing
 * quantities, or modifying discounts. The `orderEditBegin` mutation initiates an order editing session,
 * allowing you to make multiple changes before finalizing them. Learn more about using the `orderEditBegin`
 * mutation to [edit existing orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
 *   
 * Learn how to build apps that integrate with
 * [order management and fulfillment processes](https://shopify.dev/docs/apps/build/orders-fulfillment).
 */
public class OrderCreateGraphQLQuery extends GraphQLQuery {
  public OrderCreateGraphQLQuery(OrderCreateOrderInput order, OrderCreateOptionsInput options,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (order != null || fieldsSet.contains("order")) {
        getInput().put("order", order);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }
  }

  public OrderCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderCreateOrderInput order;

    private OrderCreateOptionsInput options;

    private String queryName;

    public OrderCreateGraphQLQuery build() {
      return new OrderCreateGraphQLQuery(order, options, queryName, fieldsSet);
               
    }

    /**
     * The attributes of the new order.
     */
    public Builder order(OrderCreateOrderInput order) {
      this.order = order;
      this.fieldsSet.add("order");
      return this;
    }

    /**
     * The strategies for updating inventory and whether to send shipping and order confirmations to customers.
     */
    public Builder options(OrderCreateOptionsInput options) {
      this.options = options;
      this.fieldsSet.add("options");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
