package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketingActivityCreateInput;
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
 * Create new marketing activity. Marketing activity app extensions are deprecated and will be removed in the near future.
 */
public class MarketingActivityCreateGraphQLQuery extends GraphQLQuery {
  public MarketingActivityCreateGraphQLQuery(MarketingActivityCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketingActivityCreateGraphQLQuery(MarketingActivityCreateInput input, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
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

  public MarketingActivityCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private MarketingActivityCreateInput input;

    private String queryName;

    public MarketingActivityCreateGraphQLQuery build() {
      return new MarketingActivityCreateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The Input of marketing activity create.
     */
    public Builder input(MarketingActivityCreateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The Input of marketing activity create.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MarketingActivityCreateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
