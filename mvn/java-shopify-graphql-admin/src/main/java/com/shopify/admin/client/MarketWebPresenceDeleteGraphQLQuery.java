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
 * Deletes a market web presence.
 */
public class MarketWebPresenceDeleteGraphQLQuery extends GraphQLQuery {
  public MarketWebPresenceDeleteGraphQLQuery(String webPresenceId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (webPresenceId != null || fieldsSet.contains("webPresenceId")) {
        getInput().put("webPresenceId", webPresenceId);
    }
  }

  public MarketWebPresenceDeleteGraphQLQuery(String webPresenceId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (webPresenceId != null || fieldsSet.contains("webPresenceId")) {
        getInput().put("webPresenceId", webPresenceId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MarketWebPresenceDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketWebPresenceDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String webPresenceId;

    private String queryName;

    public MarketWebPresenceDeleteGraphQLQuery build() {
      return new MarketWebPresenceDeleteGraphQLQuery(webPresenceId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the web presence to delete.
     */
    public Builder webPresenceId(String webPresenceId) {
      this.webPresenceId = webPresenceId;
      this.fieldsSet.add("webPresenceId");
      return this;
    }

    /**
     * The ID of the web presence to delete.
     */
    public Builder webPresenceIdReference(String variableRef) {
      this.variableReferences.put("webPresenceId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("webPresenceId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
