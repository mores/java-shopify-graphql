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
public class UrlRedirectBulkDeleteBySearchGraphQLQuery extends GraphQLQuery {
  public UrlRedirectBulkDeleteBySearchGraphQLQuery(String search, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }
  }

  public UrlRedirectBulkDeleteBySearchGraphQLQuery(String search, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public UrlRedirectBulkDeleteBySearchGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectBulkDeleteBySearch";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String search;

    private String queryName;

    public UrlRedirectBulkDeleteBySearchGraphQLQuery build() {
      return new UrlRedirectBulkDeleteBySearchGraphQLQuery(search, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Search query for filtering redirects on (both Redirect from and Redirect to fields).
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * Search query for filtering redirects on (both Redirect from and Redirect to fields).
     */
    public Builder searchReference(String variableRef) {
      this.variableReferences.put("search", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("search");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
