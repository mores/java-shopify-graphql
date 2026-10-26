package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.EmailInput;
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
 * Sends an email to a customer containing a secure link to update a specific
 * vaulted payment method. This is commonly used when a customer's credit card is
 * expiring or has been declined, and they need to provide updated payment
 * details for ongoing subscriptions. The email can be customized with sender and BCC fields.
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

  public CustomerPaymentMethodSendUpdateEmailGraphQLQuery(String customerPaymentMethodId,
      EmailInput email, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerPaymentMethodId != null || fieldsSet.contains("customerPaymentMethodId")) {
        getInput().put("customerPaymentMethodId", customerPaymentMethodId);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerPaymentMethodId;

    private EmailInput email;

    private String queryName;

    public CustomerPaymentMethodSendUpdateEmailGraphQLQuery build() {
      return new CustomerPaymentMethodSendUpdateEmailGraphQLQuery(customerPaymentMethodId, email, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The payment method to be updated.
     */
    public Builder customerPaymentMethodIdReference(String variableRef) {
      this.variableReferences.put("customerPaymentMethodId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
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

    /**
     * Specifies the payment method update email fields. Only the 'from' and 'bcc' fields are accepted for input.
     */
    public Builder emailReference(String variableRef) {
      this.variableReferences.put("email", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("EmailInput")).build());
      this.fieldsSet.add("email");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
