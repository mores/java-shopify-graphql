package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CalculateRequestedOrderEditInput;
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
 * The calculated financial outcome of a requested order edit.
 */
public class RequestedOrderEditCalculateGraphQLQuery extends GraphQLQuery {
  public RequestedOrderEditCalculateGraphQLQuery(CalculateRequestedOrderEditInput input,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public RequestedOrderEditCalculateGraphQLQuery(CalculateRequestedOrderEditInput input,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public RequestedOrderEditCalculateGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "requestedOrderEditCalculate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CalculateRequestedOrderEditInput input;

    private String queryName;

    public RequestedOrderEditCalculateGraphQLQuery build() {
      return new RequestedOrderEditCalculateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for calculating a requested order edit.
     */
    public Builder input(CalculateRequestedOrderEditInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for calculating a requested order edit.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CalculateRequestedOrderEditInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
