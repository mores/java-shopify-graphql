package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MoneyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a manual payment for an order. You can only create a manual payment for an order if it isn't already
 * fully paid.
 */
public class OrderCreateManualPaymentGraphQLQuery extends GraphQLQuery {
  public OrderCreateManualPaymentGraphQLQuery(String id, MoneyInput amount,
      String paymentMethodName, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (amount != null || fieldsSet.contains("amount")) {
        getInput().put("amount", amount);
    }if (paymentMethodName != null || fieldsSet.contains("paymentMethodName")) {
        getInput().put("paymentMethodName", paymentMethodName);
    }
  }

  public OrderCreateManualPaymentGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCreateManualPayment";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private MoneyInput amount;

    private String paymentMethodName;

    private String queryName;

    public OrderCreateManualPaymentGraphQLQuery build() {
      return new OrderCreateManualPaymentGraphQLQuery(id, amount, paymentMethodName, queryName, fieldsSet);
               
    }

    /**
     * The ID of the order to create a manual payment for.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The manual payment amount to be created.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      this.fieldsSet.add("amount");
      return this;
    }

    /**
     * The name of the payment method used for creating the payment. If none is
     * provided, then the default manual payment method ('Other') will be used.
     */
    public Builder paymentMethodName(String paymentMethodName) {
      this.paymentMethodName = paymentMethodName;
      this.fieldsSet.add("paymentMethodName");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
