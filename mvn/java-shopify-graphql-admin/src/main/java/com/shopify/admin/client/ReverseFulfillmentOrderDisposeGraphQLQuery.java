package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReverseFulfillmentOrderDisposeInput;
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
 * Disposes reverse fulfillment order line items.
 */
public class ReverseFulfillmentOrderDisposeGraphQLQuery extends GraphQLQuery {
  public ReverseFulfillmentOrderDisposeGraphQLQuery(
      List<ReverseFulfillmentOrderDisposeInput> dispositionInputs, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (dispositionInputs != null || fieldsSet.contains("dispositionInputs")) {
        getInput().put("dispositionInputs", dispositionInputs);
    }
  }

  public ReverseFulfillmentOrderDisposeGraphQLQuery(
      List<ReverseFulfillmentOrderDisposeInput> dispositionInputs, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (dispositionInputs != null || fieldsSet.contains("dispositionInputs")) {
        getInput().put("dispositionInputs", dispositionInputs);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ReverseFulfillmentOrderDisposeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "reverseFulfillmentOrderDispose";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<ReverseFulfillmentOrderDisposeInput> dispositionInputs;

    private String queryName;

    public ReverseFulfillmentOrderDisposeGraphQLQuery build() {
      return new ReverseFulfillmentOrderDisposeGraphQLQuery(dispositionInputs, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input parameters required to dispose reverse fulfillment order line items.
     */
    public Builder dispositionInputs(List<ReverseFulfillmentOrderDisposeInput> dispositionInputs) {
      this.dispositionInputs = dispositionInputs;
      this.fieldsSet.add("dispositionInputs");
      return this;
    }

    /**
     * The input parameters required to dispose reverse fulfillment order line items.
     */
    public Builder dispositionInputsReference(String variableRef) {
      this.variableReferences.put("dispositionInputs", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ReverseFulfillmentOrderDisposeInput"))))).build());
      this.fieldsSet.add("dispositionInputs");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
