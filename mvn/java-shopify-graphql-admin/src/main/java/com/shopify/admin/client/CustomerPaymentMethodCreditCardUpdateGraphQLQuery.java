package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MailingAddressInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Updates an existing vaulted credit card payment method for a customer,
 * including billing address and card details. Requires a valid cardserver
 * session from a PCI-compliant environment. Use this when a customer's card
 * details have changed (e.g., new expiration date or replacement card) and
 * ongoing subscriptions or saved payment methods need to be updated.
 */
public class CustomerPaymentMethodCreditCardUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodCreditCardUpdateGraphQLQuery(String id,
      MailingAddressInput billingAddress, String sessionId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (billingAddress != null || fieldsSet.contains("billingAddress")) {
        getInput().put("billingAddress", billingAddress);
    }if (sessionId != null || fieldsSet.contains("sessionId")) {
        getInput().put("sessionId", sessionId);
    }
  }

  public CustomerPaymentMethodCreditCardUpdateGraphQLQuery(String id,
      MailingAddressInput billingAddress, String sessionId, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (billingAddress != null || fieldsSet.contains("billingAddress")) {
        getInput().put("billingAddress", billingAddress);
    }if (sessionId != null || fieldsSet.contains("sessionId")) {
        getInput().put("sessionId", sessionId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerPaymentMethodCreditCardUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodCreditCardUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private MailingAddressInput billingAddress;

    private String sessionId;

    private String queryName;

    public CustomerPaymentMethodCreditCardUpdateGraphQLQuery build() {
      return new CustomerPaymentMethodCreditCardUpdateGraphQLQuery(id, billingAddress, sessionId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the customer payment method.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the customer payment method.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
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
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MailingAddressInput"))).build());
      this.fieldsSet.add("billingAddress");
      return this;
    }

    /**
     * The Cardserver session ID.
     */
    public Builder sessionId(String sessionId) {
      this.sessionId = sessionId;
      this.fieldsSet.add("sessionId");
      return this;
    }

    /**
     * The Cardserver session ID.
     */
    public Builder sessionIdReference(String variableRef) {
      this.variableReferences.put("sessionId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("sessionId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
