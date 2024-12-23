package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderCancelReason;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Cancels an order.
 */
public class OrderCancelGraphQLQuery extends GraphQLQuery {
  public OrderCancelGraphQLQuery(String orderId, boolean refund, boolean restock,
      OrderCancelReason reason, Boolean notifyCustomer, String staffNote, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }getInput().put("refund", refund);                   getInput().put("restock", restock);                   if (reason != null || fieldsSet.contains("reason")) {
        getInput().put("reason", reason);
    }if (notifyCustomer != null || fieldsSet.contains("notifyCustomer")) {
        getInput().put("notifyCustomer", notifyCustomer);
    }if (staffNote != null || fieldsSet.contains("staffNote")) {
        getInput().put("staffNote", staffNote);
    }
  }

  public OrderCancelGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCancel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String orderId;

    private boolean refund;

    private boolean restock;

    private OrderCancelReason reason;

    private Boolean notifyCustomer;

    private String staffNote;

    private String queryName;

    public OrderCancelGraphQLQuery build() {
      return new OrderCancelGraphQLQuery(orderId, refund, restock, reason, notifyCustomer, staffNote, queryName, fieldsSet);
               
    }

    /**
     * The ID of the order to be canceled.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      this.fieldsSet.add("orderId");
      return this;
    }

    /**
     * Whether to refund the amount paid by the customer.
     */
    public Builder refund(boolean refund) {
      this.refund = refund;
      this.fieldsSet.add("refund");
      return this;
    }

    /**
     * Whether to restock the inventory committed to the order. For unpaid orders
     * fulfilled from locations that have been deactivated, inventory will not be
     * restocked to the deactivated locations even if this argument is set to true.
     */
    public Builder restock(boolean restock) {
      this.restock = restock;
      this.fieldsSet.add("restock");
      return this;
    }

    /**
     * The reason for canceling the order.
     */
    public Builder reason(OrderCancelReason reason) {
      this.reason = reason;
      this.fieldsSet.add("reason");
      return this;
    }

    /**
     * Whether to send a notification to the customer about the order cancellation.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      this.fieldsSet.add("notifyCustomer");
      return this;
    }

    /**
     * A staff-facing note about the order cancellation. This is not visible to the customer.
     */
    public Builder staffNote(String staffNote) {
      this.staffNote = staffNote;
      this.fieldsSet.add("staffNote");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
