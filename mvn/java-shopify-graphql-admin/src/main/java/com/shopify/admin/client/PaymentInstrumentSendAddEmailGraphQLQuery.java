package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.EmailInput;
import com.shopify.admin.types.PaymentInstrumentMandateInput;
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
 * Sends an email to a customer containing a secure link to add a new payment
 * instrument (e.g., credit card) for a specific resource such as a subscription,
 * order, or draft order. This is used when a customer needs to provide payment
 * details for an existing resource — for example, after a payment method was
 * revoked or when setting up payment for a new subscription contract.
 */
public class PaymentInstrumentSendAddEmailGraphQLQuery extends GraphQLQuery {
  public PaymentInstrumentSendAddEmailGraphQLQuery(PaymentInstrumentMandateInput mandate,
      EmailInput email, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (mandate != null || fieldsSet.contains("mandate")) {
        getInput().put("mandate", mandate);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public PaymentInstrumentSendAddEmailGraphQLQuery(PaymentInstrumentMandateInput mandate,
      EmailInput email, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (mandate != null || fieldsSet.contains("mandate")) {
        getInput().put("mandate", mandate);
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

  public PaymentInstrumentSendAddEmailGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentInstrumentSendAddEmail";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private PaymentInstrumentMandateInput mandate;

    private EmailInput email;

    private String queryName;

    public PaymentInstrumentSendAddEmailGraphQLQuery build() {
      return new PaymentInstrumentSendAddEmailGraphQLQuery(mandate, email, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The mandate resource (subscription, order, or draft order) to add a payment instrument for.
     */
    public Builder mandate(PaymentInstrumentMandateInput mandate) {
      this.mandate = mandate;
      this.fieldsSet.add("mandate");
      return this;
    }

    /**
     * The mandate resource (subscription, order, or draft order) to add a payment instrument for.
     */
    public Builder mandateReference(String variableRef) {
      this.variableReferences.put("mandate", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("PaymentInstrumentMandateInput"))).build());
      this.fieldsSet.add("mandate");
      return this;
    }

    /**
     * Specifies the payment instrument add email fields. Only the 'from' and 'bcc' fields are accepted for input.
     */
    public Builder email(EmailInput email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    /**
     * Specifies the payment instrument add email fields. Only the 'from' and 'bcc' fields are accepted for input.
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
