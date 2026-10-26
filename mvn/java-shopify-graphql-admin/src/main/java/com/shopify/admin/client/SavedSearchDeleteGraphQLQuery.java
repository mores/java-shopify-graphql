package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SavedSearchDeleteInput;
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
 * Delete a saved search.
 */
public class SavedSearchDeleteGraphQLQuery extends GraphQLQuery {
  public SavedSearchDeleteGraphQLQuery(SavedSearchDeleteInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SavedSearchDeleteGraphQLQuery(SavedSearchDeleteInput input, String queryName,
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

  public SavedSearchDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "savedSearchDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SavedSearchDeleteInput input;

    private String queryName;

    public SavedSearchDeleteGraphQLQuery build() {
      return new SavedSearchDeleteGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields to delete a saved search.
     */
    public Builder input(SavedSearchDeleteInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields to delete a saved search.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SavedSearchDeleteInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
