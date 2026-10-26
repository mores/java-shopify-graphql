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
 * Deletes an [analytics annotation](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsAnnotation).
 * An app can delete only annotations that it created. If an app attempts to delete an annotation that it
 * didn't create, then the mutation returns a `NOT_FOUND` error.
 * Use [`analyticsAnnotationCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsAnnotationCreate)
 * to create a new annotation, or
 * [`analyticsAnnotationUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsAnnotationUpdate)
 * to modify existing ones.
 */
public class AnalyticsAnnotationDeleteGraphQLQuery extends GraphQLQuery {
  public AnalyticsAnnotationDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public AnalyticsAnnotationDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public AnalyticsAnnotationDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "analyticsAnnotationDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String queryName;

    public AnalyticsAnnotationDeleteGraphQLQuery build() {
      return new AnalyticsAnnotationDeleteGraphQLQuery(id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the analytics annotation to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the analytics annotation to delete.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
