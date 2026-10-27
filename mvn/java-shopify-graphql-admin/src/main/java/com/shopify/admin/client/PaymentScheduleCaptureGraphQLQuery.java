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
 * Captures payment for a due [`PaymentSchedule`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PaymentSchedule)
 * using the vaulted payment method associated with the order.
 *   
 * The mutation resolves the order and mandate from the given payment schedule, then initiates
 * an asynchronous payment capture. Use the returned `jobResult` to poll for the status of the
 * payment capture.
 */
public class PaymentScheduleCaptureGraphQLQuery extends GraphQLQuery {
  public PaymentScheduleCaptureGraphQLQuery(String paymentScheduleId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (paymentScheduleId != null || fieldsSet.contains("paymentScheduleId")) {
        getInput().put("paymentScheduleId", paymentScheduleId);
    }
  }

  public PaymentScheduleCaptureGraphQLQuery(String paymentScheduleId, String queryName,
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

  public PaymentScheduleCaptureGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentScheduleCapture";
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

    public PaymentScheduleCaptureGraphQLQuery build() {
      return new PaymentScheduleCaptureGraphQLQuery(paymentScheduleId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the payment schedule to capture payment for.
     */
    public Builder paymentScheduleId(String paymentScheduleId) {
      this.paymentScheduleId = paymentScheduleId;
      this.fieldsSet.add("paymentScheduleId");
      return this;
    }

    /**
     * The ID of the payment schedule to capture payment for.
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
