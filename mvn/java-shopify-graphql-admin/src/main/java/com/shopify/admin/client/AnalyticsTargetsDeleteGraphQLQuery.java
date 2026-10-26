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
 * Deletes one or more [analytics targets](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
 * Accepts a list of target IDs and returns the IDs that were successfully deleted. If any ID
 * is not found, a user error is returned for that ID while the remaining valid targets are still deleted.
 *   
 * Use [`analyticsTargetCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsTargetCreate)
 * to create new targets, or
 * [`analyticsTargetUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsTargetUpdate)
 * to modify existing ones.
 */
public class AnalyticsTargetsDeleteGraphQLQuery extends GraphQLQuery {
  public AnalyticsTargetsDeleteGraphQLQuery(List<String> ids, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public AnalyticsTargetsDeleteGraphQLQuery(List<String> ids, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public AnalyticsTargetsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "analyticsTargetsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> ids;

    private String queryName;

    public AnalyticsTargetsDeleteGraphQLQuery build() {
      return new AnalyticsTargetsDeleteGraphQLQuery(ids, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The IDs of the analytics targets to delete.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * The IDs of the analytics targets to delete.
     */
    public Builder idsReference(String variableRef) {
      this.variableReferences.put("ids", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("ids");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
