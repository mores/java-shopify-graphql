package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentOrderMergeInput;
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
 * Merges a set or multiple sets of fulfillment orders together into one based on
 * line item inputs and quantities.
 */
public class FulfillmentOrderMergeGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderMergeGraphQLQuery(
      List<FulfillmentOrderMergeInput> fulfillmentOrderMergeInputs, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentOrderMergeInputs != null || fieldsSet.contains("fulfillmentOrderMergeInputs")) {
        getInput().put("fulfillmentOrderMergeInputs", fulfillmentOrderMergeInputs);
    }
  }

  public FulfillmentOrderMergeGraphQLQuery(
      List<FulfillmentOrderMergeInput> fulfillmentOrderMergeInputs, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (fulfillmentOrderMergeInputs != null || fieldsSet.contains("fulfillmentOrderMergeInputs")) {
        getInput().put("fulfillmentOrderMergeInputs", fulfillmentOrderMergeInputs);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FulfillmentOrderMergeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderMerge";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<FulfillmentOrderMergeInput> fulfillmentOrderMergeInputs;

    private String queryName;

    public FulfillmentOrderMergeGraphQLQuery build() {
      return new FulfillmentOrderMergeGraphQLQuery(fulfillmentOrderMergeInputs, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * One or more sets of fulfillment orders to be merged.
     */
    public Builder fulfillmentOrderMergeInputs(
        List<FulfillmentOrderMergeInput> fulfillmentOrderMergeInputs) {
      this.fulfillmentOrderMergeInputs = fulfillmentOrderMergeInputs;
      this.fieldsSet.add("fulfillmentOrderMergeInputs");
      return this;
    }

    /**
     * One or more sets of fulfillment orders to be merged.
     */
    public Builder fulfillmentOrderMergeInputsReference(String variableRef) {
      this.variableReferences.put("fulfillmentOrderMergeInputs", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("FulfillmentOrderMergeInput"))))).build());
      this.fieldsSet.add("fulfillmentOrderMergeInputs");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
