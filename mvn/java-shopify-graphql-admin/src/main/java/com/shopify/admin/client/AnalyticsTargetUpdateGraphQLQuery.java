package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.AnalyticsTargetUpdateInput;
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
 * Updates an existing [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
 * Only the fields provided in the `input` argument are modified; omitted fields remain unchanged.
 * Setting a nullable field to `null` clears its value.
 *   
 * Use [`analyticsTargetCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsTargetCreate)
 * to create a new target, or
 * [`analyticsTargetsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsTargetsDelete)
 * to remove targets.
 */
public class AnalyticsTargetUpdateGraphQLQuery extends GraphQLQuery {
  public AnalyticsTargetUpdateGraphQLQuery(String id, AnalyticsTargetUpdateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public AnalyticsTargetUpdateGraphQLQuery(String id, AnalyticsTargetUpdateInput input,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public AnalyticsTargetUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "analyticsTargetUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private AnalyticsTargetUpdateInput input;

    private String queryName;

    public AnalyticsTargetUpdateGraphQLQuery build() {
      return new AnalyticsTargetUpdateGraphQLQuery(id, input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the analytics target to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the analytics target to update.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields for updating an [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
     */
    public Builder input(AnalyticsTargetUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for updating an [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("AnalyticsTargetUpdateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
