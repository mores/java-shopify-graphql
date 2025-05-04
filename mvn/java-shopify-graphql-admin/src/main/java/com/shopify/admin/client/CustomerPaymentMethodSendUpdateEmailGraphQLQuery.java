package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.EmailInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sends a link to the customer so they can update a specific payment method.
 */
public class CustomerPaymentMethodSendUpdateEmailGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodSendUpdateEmailGraphQLQuery(String customerPaymentMethodId,
      EmailInput email, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerPaymentMethodId != null || fieldsSet.contains("customerPaymentMethodId")) {
        getInput().put("customerPaymentMethodId", customerPaymentMethodId);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public CustomerPaymentMethodSendUpdateEmailGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodSendUpdateEmail";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerPaymentMethodId;

    private EmailInput email;

    private String queryName;

    public CustomerPaymentMethodSendUpdateEmailGraphQLQuery build() {
      return new CustomerPaymentMethodSendUpdateEmailGraphQLQuery(customerPaymentMethodId, email, queryName, fieldsSet);
               
    }

    /**
     * The payment method to be updated.
     */
    public Builder customerPaymentMethodId(String customerPaymentMethodId) {
      this.customerPaymentMethodId = customerPaymentMethodId;
      this.fieldsSet.add("customerPaymentMethodId");
      return this;
    }

    /**
     * Specifies the payment method update email fields. Only the 'from' and 'bcc' fields are accepted for input.
     */
    public Builder email(EmailInput email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
