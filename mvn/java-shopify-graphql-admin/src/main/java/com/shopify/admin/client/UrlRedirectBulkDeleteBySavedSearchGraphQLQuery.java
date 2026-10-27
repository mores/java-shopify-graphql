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
 * Asynchronously delete redirects in bulk.
 */
public class UrlRedirectBulkDeleteBySavedSearchGraphQLQuery extends GraphQLQuery {
  public UrlRedirectBulkDeleteBySavedSearchGraphQLQuery(String savedSearchId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
  }

  public UrlRedirectBulkDeleteBySavedSearchGraphQLQuery(String savedSearchId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public UrlRedirectBulkDeleteBySavedSearchGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectBulkDeleteBySavedSearch";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String savedSearchId;

    private String queryName;

    public UrlRedirectBulkDeleteBySavedSearchGraphQLQuery build() {
      return new UrlRedirectBulkDeleteBySavedSearchGraphQLQuery(savedSearchId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the URL redirect saved search for filtering.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The ID of the URL redirect saved search for filtering.
     */
    public Builder savedSearchIdReference(String variableRef) {
      this.variableReferences.put("savedSearchId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
