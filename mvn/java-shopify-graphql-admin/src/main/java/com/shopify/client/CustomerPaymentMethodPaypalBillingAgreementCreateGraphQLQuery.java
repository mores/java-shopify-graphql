package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MailingAddressInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a PayPal billing agreement for a customer.
 */
public class CustomerPaymentMethodPaypalBillingAgreementCreateGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodPaypalBillingAgreementCreateGraphQLQuery(String customerId,
      MailingAddressInput billingAddress, String billingAgreementId, Boolean inactive,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (billingAddress != null || fieldsSet.contains("billingAddress")) {
        getInput().put("billingAddress", billingAddress);
    }if (billingAgreementId != null || fieldsSet.contains("billingAgreementId")) {
        getInput().put("billingAgreementId", billingAgreementId);
    }if (inactive != null || fieldsSet.contains("inactive")) {
        getInput().put("inactive", inactive);
    }
  }

  public CustomerPaymentMethodPaypalBillingAgreementCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodPaypalBillingAgreementCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private MailingAddressInput billingAddress;

    private String billingAgreementId;

    private Boolean inactive;

    private String queryName;

    public CustomerPaymentMethodPaypalBillingAgreementCreateGraphQLQuery build() {
      return new CustomerPaymentMethodPaypalBillingAgreementCreateGraphQLQuery(customerId, billingAddress, billingAgreementId, inactive, queryName, fieldsSet);
               
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
     * The billing address.
     */
    public Builder billingAddress(MailingAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      this.fieldsSet.add("billingAddress");
      return this;
    }

    /**
     * The billing agreement ID from PayPal that starts with 'B-' (for example, `B-1234XXXXX`).
     */
    public Builder billingAgreementId(String billingAgreementId) {
      this.billingAgreementId = billingAgreementId;
      this.fieldsSet.add("billingAgreementId");
      return this;
    }

    /**
     * Whether the PayPal billing agreement is inactive.
     */
    public Builder inactive(Boolean inactive) {
      this.inactive = inactive;
      this.fieldsSet.add("inactive");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
