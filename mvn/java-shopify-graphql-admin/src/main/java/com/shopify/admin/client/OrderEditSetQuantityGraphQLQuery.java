package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sets the quantity of a line item on an order that is being edited. For more
 * information on how to use the GraphQL Admin API to edit an existing order,
 * refer to [Edit existing orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
 */
public class OrderEditSetQuantityGraphQLQuery extends GraphQLQuery {
  public OrderEditSetQuantityGraphQLQuery(String id, String lineItemId, int quantity,
      Boolean restock, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItemId != null || fieldsSet.contains("lineItemId")) {
        getInput().put("lineItemId", lineItemId);
    }getInput().put("quantity", quantity);                   if (restock != null || fieldsSet.contains("restock")) {
        getInput().put("restock", restock);
    }
  }

  public OrderEditSetQuantityGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditSetQuantity";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String lineItemId;

    private int quantity;

    private Boolean restock;

    private String queryName;

    public OrderEditSetQuantityGraphQLQuery build() {
      return new OrderEditSetQuantityGraphQLQuery(id, lineItemId, quantity, restock, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * to edit. The edit changes the quantity on the line item.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the calculated line item to edit.
     */
    public Builder lineItemId(String lineItemId) {
      this.lineItemId = lineItemId;
      this.fieldsSet.add("lineItemId");
      return this;
    }

    /**
     * The new quantity to set for the line item. This value cannot be negative.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      this.fieldsSet.add("quantity");
      return this;
    }

    /**
     * Whether or not to restock the line item when the updated quantity is less than the original quantity.
     */
    public Builder restock(Boolean restock) {
      this.restock = restock;
      this.fieldsSet.add("restock");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
