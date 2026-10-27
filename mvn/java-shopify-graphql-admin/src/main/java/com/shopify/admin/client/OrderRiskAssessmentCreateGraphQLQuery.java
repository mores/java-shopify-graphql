package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderRiskAssessmentCreateInput;
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
 * Creates a risk assessment for a specific order using the provided risk level
 * and facts. Shopify sends an `orders/risk_assessment_changed` webhook when the
 * assessment is created.
 */
public class OrderRiskAssessmentCreateGraphQLQuery extends GraphQLQuery {
  public OrderRiskAssessmentCreateGraphQLQuery(
      OrderRiskAssessmentCreateInput orderRiskAssessmentInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderRiskAssessmentInput != null || fieldsSet.contains("orderRiskAssessmentInput")) {
        getInput().put("orderRiskAssessmentInput", orderRiskAssessmentInput);
    }
  }

  public OrderRiskAssessmentCreateGraphQLQuery(
      OrderRiskAssessmentCreateInput orderRiskAssessmentInput, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (orderRiskAssessmentInput != null || fieldsSet.contains("orderRiskAssessmentInput")) {
        getInput().put("orderRiskAssessmentInput", orderRiskAssessmentInput);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public OrderRiskAssessmentCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderRiskAssessmentCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private OrderRiskAssessmentCreateInput orderRiskAssessmentInput;

    private String queryName;

    public OrderRiskAssessmentCreateGraphQLQuery build() {
      return new OrderRiskAssessmentCreateGraphQLQuery(orderRiskAssessmentInput, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input for creating an order risk assessment.
     */
    public Builder orderRiskAssessmentInput(
        OrderRiskAssessmentCreateInput orderRiskAssessmentInput) {
      this.orderRiskAssessmentInput = orderRiskAssessmentInput;
      this.fieldsSet.add("orderRiskAssessmentInput");
      return this;
    }

    /**
     * The input for creating an order risk assessment.
     */
    public Builder orderRiskAssessmentInputReference(String variableRef) {
      this.variableReferences.put("orderRiskAssessmentInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("OrderRiskAssessmentCreateInput"))).build());
      this.fieldsSet.add("orderRiskAssessmentInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
