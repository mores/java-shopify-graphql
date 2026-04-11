package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderEditAddShippingLineInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds a custom shipping line to an
 * [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
 * during an edit session. Specify the shipping title and price to create a new [`ShippingLine`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ShippingLine).
 *   
 *  Returns a [`CalculatedOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CalculatedOrder) showing the order with edits applied but not yet saved. To save your changes, use the [`orderEditCommit`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditCommit) mutation.
 *   
 * Learn more about [editing existing orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
 */
public class OrderEditAddShippingLineGraphQLQuery extends GraphQLQuery {
  public OrderEditAddShippingLineGraphQLQuery(String id, OrderEditAddShippingLineInput shippingLine,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (shippingLine != null || fieldsSet.contains("shippingLine")) {
        getInput().put("shippingLine", shippingLine);
    }
  }

  public OrderEditAddShippingLineGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditAddShippingLine";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private OrderEditAddShippingLineInput shippingLine;

    private String queryName;

    public OrderEditAddShippingLineGraphQLQuery build() {
      return new OrderEditAddShippingLineGraphQLQuery(id, shippingLine, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * or the order edit session to edit. This is the edit to which the shipping line is added.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The shipping line to be added.
     */
    public Builder shippingLine(OrderEditAddShippingLineInput shippingLine) {
      this.shippingLine = shippingLine;
      this.fieldsSet.add("shippingLine");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
