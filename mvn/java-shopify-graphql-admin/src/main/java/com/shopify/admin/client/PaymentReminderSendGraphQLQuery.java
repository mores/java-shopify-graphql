package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Sends an email payment reminder for a payment schedule.
 */
public class PaymentReminderSendGraphQLQuery extends GraphQLQuery {
  public PaymentReminderSendGraphQLQuery(String paymentScheduleId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (paymentScheduleId != null || fieldsSet.contains("paymentScheduleId")) {
        getInput().put("paymentScheduleId", paymentScheduleId);
    }
  }

  public PaymentReminderSendGraphQLQuery(String paymentScheduleId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (paymentScheduleId != null || fieldsSet.contains("paymentScheduleId")) {
        getInput().put("paymentScheduleId", paymentScheduleId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PaymentReminderSendGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentReminderSend";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String paymentScheduleId;

    private String queryName;

    public PaymentReminderSendGraphQLQuery build() {
      return new PaymentReminderSendGraphQLQuery(paymentScheduleId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The payment schedule id associated with the reminder.
     */
    public Builder paymentScheduleId(String paymentScheduleId) {
      this.paymentScheduleId = paymentScheduleId;
      this.fieldsSet.add("paymentScheduleId");
      return this;
    }

    /**
     * The payment schedule id associated with the reminder.
     */
    public Builder paymentScheduleIdReference(String variableRef) {
      this.variableReferences.put("paymentScheduleId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("paymentScheduleId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
