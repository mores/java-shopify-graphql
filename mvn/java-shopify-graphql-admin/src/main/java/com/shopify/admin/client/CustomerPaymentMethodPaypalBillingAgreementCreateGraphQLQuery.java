package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MailingAddressInput;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates a vaulted PayPal billing agreement for a customer, enabling recurring
 * charges through PayPal. The billing agreement ID (starting with 'B-') must be
 * obtained from PayPal. Once created, this payment method can be used for
 * subscription billing or future order payments without requiring the customer
 * to re-authenticate with PayPal.
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

  public CustomerPaymentMethodPaypalBillingAgreementCreateGraphQLQuery(String customerId,
      MailingAddressInput billingAddress, String billingAgreementId, Boolean inactive,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
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
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerId;

    private MailingAddressInput billingAddress;

    private String billingAgreementId;

    private Boolean inactive;

    private String queryName;

    public CustomerPaymentMethodPaypalBillingAgreementCreateGraphQLQuery build() {
      return new CustomerPaymentMethodPaypalBillingAgreementCreateGraphQLQuery(customerId, billingAddress, billingAgreementId, inactive, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The ID of the customer.
     */
    public Builder customerIdReference(String variableRef) {
      this.variableReferences.put("customerId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
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
     * The billing address.
     */
    public Builder billingAddressReference(String variableRef) {
      this.variableReferences.put("billingAddress", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("MailingAddressInput")).build());
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
     * The billing agreement ID from PayPal that starts with 'B-' (for example, `B-1234XXXXX`).
     */
    public Builder billingAgreementIdReference(String variableRef) {
      this.variableReferences.put("billingAgreementId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
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

    /**
     * Whether the PayPal billing agreement is inactive.
     */
    public Builder inactiveReference(String variableRef) {
      this.variableReferences.put("inactive", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("inactive");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
