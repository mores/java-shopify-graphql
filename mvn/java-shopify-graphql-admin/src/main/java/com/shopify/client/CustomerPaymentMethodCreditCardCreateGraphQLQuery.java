package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MailingAddressInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CustomerPaymentMethodCreditCardCreateGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodCreditCardCreateGraphQLQuery(String customerId,
      MailingAddressInput billingAddress, String sessionId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (billingAddress != null || fieldsSet.contains("billingAddress")) {
        getInput().put("billingAddress", billingAddress);
    }if (sessionId != null || fieldsSet.contains("sessionId")) {
        getInput().put("sessionId", sessionId);
    }
  }

  public CustomerPaymentMethodCreditCardCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodCreditCardCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private MailingAddressInput billingAddress;

    private String sessionId;

    private String queryName;

    public CustomerPaymentMethodCreditCardCreateGraphQLQuery build() {
      return new CustomerPaymentMethodCreditCardCreateGraphQLQuery(customerId, billingAddress, sessionId, queryName, fieldsSet);
               
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    
    public Builder billingAddress(MailingAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      this.fieldsSet.add("billingAddress");
      return this;
    }

    
    public Builder sessionId(String sessionId) {
      this.sessionId = sessionId;
      this.fieldsSet.add("sessionId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
