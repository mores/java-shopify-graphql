package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a payment method from a credit card stored by Stripe.
 */
public class CustomerPaymentMethodRemoteCreditCardCreateGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodRemoteCreditCardCreateGraphQLQuery(String customerId,
      String stripeCustomerId, String stripePaymentMethodId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (stripeCustomerId != null || fieldsSet.contains("stripeCustomerId")) {
        getInput().put("stripeCustomerId", stripeCustomerId);
    }if (stripePaymentMethodId != null || fieldsSet.contains("stripePaymentMethodId")) {
        getInput().put("stripePaymentMethodId", stripePaymentMethodId);
    }
  }

  public CustomerPaymentMethodRemoteCreditCardCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodRemoteCreditCardCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private String stripeCustomerId;

    private String stripePaymentMethodId;

    private String queryName;

    public CustomerPaymentMethodRemoteCreditCardCreateGraphQLQuery build() {
      return new CustomerPaymentMethodRemoteCreditCardCreateGraphQLQuery(customerId, stripeCustomerId, stripePaymentMethodId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * The Stripe Customer ID.
     */
    public Builder stripeCustomerId(String stripeCustomerId) {
      this.stripeCustomerId = stripeCustomerId;
      this.fieldsSet.add("stripeCustomerId");
      return this;
    }

    /**
     * The Stripe Payment Method ID. Starting on 2025, stripe_payment_method_id will become mandatory for all API versions.
     */
    public Builder stripePaymentMethodId(String stripePaymentMethodId) {
      this.stripePaymentMethodId = stripePaymentMethodId;
      this.fieldsSet.add("stripePaymentMethodId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
