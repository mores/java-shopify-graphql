package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MoneyInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a payment for an
 * [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order) using a stored [`PaymentMandate`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PaymentMandate).
 * A payment mandate represents the customer's authorization to charge their
 * payment method for deferred payments, such as pre-orders or try-before-you-buy purchases.
 *   
 * The mutation processes the payment asynchronously and returns a
 * [`Job`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Job) for
 * tracking the payment status. You can specify the payment amount to collect, and use the [`autoCapture`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderCreateMandatePayment#arguments-autoCapture)
 * argument to either immediately capture the payment or only authorize it for
 * later capture. Each payment request requires a unique [`idempotencyKey`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderCreateMandatePayment#arguments-idempotencyKey)
 * to prevent duplicate charges. Subsequent calls with the same key return the
 * original payment result rather than creating a new payment.
 *   
 * Learn more about [deferred payments and payment mandates](https://shopify.dev/docs/apps/build/purchase-options/deferred#charging-the-remaining-balance)
 * and [idempotent
 * requests](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
public class OrderCreateMandatePaymentGraphQLQuery extends GraphQLQuery {
  public OrderCreateMandatePaymentGraphQLQuery(String id, String paymentScheduleId,
      String idempotencyKey, String mandateId, MoneyInput amount, Boolean autoCapture,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (paymentScheduleId != null || fieldsSet.contains("paymentScheduleId")) {
        getInput().put("paymentScheduleId", paymentScheduleId);
    }if (idempotencyKey != null || fieldsSet.contains("idempotencyKey")) {
        getInput().put("idempotencyKey", idempotencyKey);
    }if (mandateId != null || fieldsSet.contains("mandateId")) {
        getInput().put("mandateId", mandateId);
    }if (amount != null || fieldsSet.contains("amount")) {
        getInput().put("amount", amount);
    }if (autoCapture != null || fieldsSet.contains("autoCapture")) {
        getInput().put("autoCapture", autoCapture);
    }
  }

  public OrderCreateMandatePaymentGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCreateMandatePayment";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String paymentScheduleId;

    private String idempotencyKey;

    private String mandateId;

    private MoneyInput amount;

    private Boolean autoCapture;

    private String queryName;

    public OrderCreateMandatePaymentGraphQLQuery build() {
      return new OrderCreateMandatePaymentGraphQLQuery(id, paymentScheduleId, idempotencyKey, mandateId, amount, autoCapture, queryName, fieldsSet);
               
    }

    /**
     * The ID of the order to collect the balance for.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the payment schedule to collect the balance for.
     */
    public Builder paymentScheduleId(String paymentScheduleId) {
      this.paymentScheduleId = paymentScheduleId;
      this.fieldsSet.add("paymentScheduleId");
      return this;
    }

    /**
     * A unique key to identify the payment request.
     */
    public Builder idempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      this.fieldsSet.add("idempotencyKey");
      return this;
    }

    /**
     * The mandate ID used for payment.
     */
    public Builder mandateId(String mandateId) {
      this.mandateId = mandateId;
      this.fieldsSet.add("mandateId");
      return this;
    }

    /**
     * The payment amount to collect.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      this.fieldsSet.add("amount");
      return this;
    }

    /**
     * Whether the payment should be authorized or captured. If `false`, then the authorization of
     *             the payment is triggered.
     */
    public Builder autoCapture(Boolean autoCapture) {
      this.autoCapture = autoCapture;
      this.fieldsSet.add("autoCapture");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
