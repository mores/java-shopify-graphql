package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderEditAppliedDiscountInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Applies a discount to a [`LineItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem)
 * during an order edit session. The discount can be either a fixed amount or
 * percentage value.
 *   
 * To modify pricing on specific line items, use this mutation after starting an
 * order edit with the [`orderEditBegin`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditBegin)
 * mutation. The changes remain staged until you commit them with the [`orderEditCommit`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditCommit) mutation.
 *   
 * Learn more about [editing existing orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
 */
public class OrderEditAddLineItemDiscountGraphQLQuery extends GraphQLQuery {
  public OrderEditAddLineItemDiscountGraphQLQuery(String id, String lineItemId,
      OrderEditAppliedDiscountInput discount, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItemId != null || fieldsSet.contains("lineItemId")) {
        getInput().put("lineItemId", lineItemId);
    }if (discount != null || fieldsSet.contains("discount")) {
        getInput().put("discount", discount);
    }
  }

  public OrderEditAddLineItemDiscountGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditAddLineItemDiscount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String lineItemId;

    private OrderEditAppliedDiscountInput discount;

    private String queryName;

    public OrderEditAddLineItemDiscountGraphQLQuery build() {
      return new OrderEditAddLineItemDiscountGraphQLQuery(id, lineItemId, discount, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * or the order edit session to edit.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the calculated line item to add the discount to.
     */
    public Builder lineItemId(String lineItemId) {
      this.lineItemId = lineItemId;
      this.fieldsSet.add("lineItemId");
      return this;
    }

    /**
     * The discount to add to the line item.
     */
    public Builder discount(OrderEditAppliedDiscountInput discount) {
      this.discount = discount;
      this.fieldsSet.add("discount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
