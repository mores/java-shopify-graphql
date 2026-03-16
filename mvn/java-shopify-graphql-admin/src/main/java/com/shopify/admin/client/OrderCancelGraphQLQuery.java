package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderCancelReason;
import com.shopify.admin.types.OrderCancelRefundMethodInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Cancels an order, with options for refunding, restocking inventory, and customer notification.
 *   
 * > Caution:
 * > Order cancellation is irreversible. An order that has been cancelled can't be restored to its original state.
 *   
 * Use the `orderCancel` mutation to programmatically cancel orders in scenarios such as:
 *   
 * - Customer-requested cancellations due to size, color, or other preference changes
 * - Payment processing failures or declined transactions
 * - Fraud detection and prevention
 * - Insufficient inventory availability
 * - Staff errors in order processing
 * - Wholesale or B2B order management workflows
 *   
 * The `orderCancel` mutation provides flexible refund options including refunding to original payment methods
 * or issuing store credit. If a payment was only authorized (temporarily held) but not yet charged,
 * that hold will be automatically released when the order is cancelled, even if you choose not to refund other payments.
 *   
 * The mutation supports different cancellation reasons: customer requests, payment declines, fraud,
 * inventory issues, staff errors, or other unspecified reasons. Each cancellation can include optional
 * staff notes for internal documentation (notes aren't visible to customers).
 *   
 * An order can only be cancelled if it meets the following criteria:
 *   
 * - The order hasn't already been cancelled.
 * - The order has no pending payment authorizations.
 * - The order has no active returns in progress.
 * - The order has no outstanding fulfillments that can't be cancelled.
 *   
 * Orders might be assigned to locations that become
 * [deactivated](https://help.shopify.com/manual/fulfillment/setup/locations-management#deactivate-and-reactivate-locations)
 * after the order was created. When cancelling such orders, inventory behavior depends on payment status:
 *   
 * - **Paid orders**: Cancellation will fail with an error if restocking is enabled, since inventory
 * can't be returned to deactivated locations.
 * - **Unpaid orders**: Cancellation succeeds but inventory is not restocked anywhere, even when the
 * restock option is enabled. The committed inventory effectively becomes unavailable rather than being
 * returned to stock at the deactivated location.
 *   
 * After you cancel an order, you can still make limited updates to certain fields (like
 * notes and tags) using the
 * [`orderUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderUpdate).
 *   
 * For partial refunds or more complex refund scenarios on active orders,
 * such as refunding only specific line items while keeping the rest of the order fulfilled,
 * consider using the [`refundCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/refundCreate)
 * mutation instead of full order cancellation.
 *   
 * Learn how to build apps that integrate with
 * [order management and fulfillment processes](https://shopify.dev/docs/apps/build/orders-fulfillment).
 */
public class OrderCancelGraphQLQuery extends GraphQLQuery {
  public OrderCancelGraphQLQuery(String orderId, OrderCancelRefundMethodInput refundMethod,
      boolean restock, OrderCancelReason reason, Boolean notifyCustomer, String staffNote,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }if (refundMethod != null || fieldsSet.contains("refundMethod")) {
        getInput().put("refundMethod", refundMethod);
    }getInput().put("restock", restock);                   if (reason != null || fieldsSet.contains("reason")) {
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

    private OrderCancelRefundMethodInput refundMethod;

    private boolean restock;

    private OrderCancelReason reason;

    private Boolean notifyCustomer;

    private String staffNote;

    private String queryName;

    public OrderCancelGraphQLQuery build() {
      return new OrderCancelGraphQLQuery(orderId, refundMethod, restock, reason, notifyCustomer, staffNote, queryName, fieldsSet);
               
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
     * Indicates how to refund the amount paid by the customer. Authorized payments will be voided regardless of this setting.
     */
    public Builder refundMethod(OrderCancelRefundMethodInput refundMethod) {
      this.refundMethod = refundMethod;
      this.fieldsSet.add("refundMethod");
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
     * A staff-facing note about the order cancellation. This is not visible to the customer. Maximum length of 255 characters.
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
