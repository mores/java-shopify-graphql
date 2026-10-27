package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.BuyerSignalInput;
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
 * The resolved values for a buyer signal.
 */
public class MarketsResolvedValuesGraphQLQuery extends GraphQLQuery {
  public MarketsResolvedValuesGraphQLQuery(BuyerSignalInput buyerSignal, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (buyerSignal != null || fieldsSet.contains("buyerSignal")) {
        getInput().put("buyerSignal", buyerSignal);
    }
  }

  public MarketsResolvedValuesGraphQLQuery(BuyerSignalInput buyerSignal, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (buyerSignal != null || fieldsSet.contains("buyerSignal")) {
        getInput().put("buyerSignal", buyerSignal);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MarketsResolvedValuesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "marketsResolvedValues";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private BuyerSignalInput buyerSignal;

    private String queryName;

    public MarketsResolvedValuesGraphQLQuery build() {
      return new MarketsResolvedValuesGraphQLQuery(buyerSignal, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The buyer signal.
     */
    public Builder buyerSignal(BuyerSignalInput buyerSignal) {
      this.buyerSignal = buyerSignal;
      this.fieldsSet.add("buyerSignal");
      return this;
    }

    /**
     * The buyer signal.
     */
    public Builder buyerSignalReference(String variableRef) {
      this.variableReferences.put("buyerSignal", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("BuyerSignalInput"))).build());
      this.fieldsSet.add("buyerSignal");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
