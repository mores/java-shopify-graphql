package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketingActivityUpsertExternalInput;
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
 * Creates a new external marketing activity or updates an existing one. When
 * optional fields are absent or null, associated information will be removed
 * from an existing marketing activity.
 */
public class MarketingActivityUpsertExternalGraphQLQuery extends GraphQLQuery {
  public MarketingActivityUpsertExternalGraphQLQuery(MarketingActivityUpsertExternalInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketingActivityUpsertExternalGraphQLQuery(MarketingActivityUpsertExternalInput input,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
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

  public MarketingActivityUpsertExternalGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityUpsertExternal";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private MarketingActivityUpsertExternalInput input;

    private String queryName;

    public MarketingActivityUpsertExternalGraphQLQuery build() {
      return new MarketingActivityUpsertExternalGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input field for creating or updating an external marketing activity.
     */
    public Builder input(MarketingActivityUpsertExternalInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input field for creating or updating an external marketing activity.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MarketingActivityUpsertExternalInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
