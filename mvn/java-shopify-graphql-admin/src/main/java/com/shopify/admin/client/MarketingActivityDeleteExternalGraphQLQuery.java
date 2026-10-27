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
 * Deletes an external marketing activity.
 */
public class MarketingActivityDeleteExternalGraphQLQuery extends GraphQLQuery {
  public MarketingActivityDeleteExternalGraphQLQuery(String marketingActivityId, String remoteId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (remoteId != null || fieldsSet.contains("remoteId")) {
        getInput().put("remoteId", remoteId);
    }
  }

  public MarketingActivityDeleteExternalGraphQLQuery(String marketingActivityId, String remoteId,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (remoteId != null || fieldsSet.contains("remoteId")) {
        getInput().put("remoteId", remoteId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MarketingActivityDeleteExternalGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityDeleteExternal";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String marketingActivityId;

    private String remoteId;

    private String queryName;

    public MarketingActivityDeleteExternalGraphQLQuery build() {
      return new MarketingActivityDeleteExternalGraphQLQuery(marketingActivityId, remoteId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the marketing activity. A marketing activity ID or remote ID must be provided.
     */
    public Builder marketingActivityId(String marketingActivityId) {
      this.marketingActivityId = marketingActivityId;
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    /**
     * The ID of the marketing activity. A marketing activity ID or remote ID must be provided.
     */
    public Builder marketingActivityIdReference(String variableRef) {
      this.variableReferences.put("marketingActivityId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    /**
     * A custom unique identifier for the marketing activity, which can be used to
     * manage the activity and send engagement metrics without having to store our
     * marketing activity ID in your systems. A marketing activity ID or remote ID
     * must be provided.
     */
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      this.fieldsSet.add("remoteId");
      return this;
    }

    /**
     * A custom unique identifier for the marketing activity, which can be used to
     * manage the activity and send engagement metrics without having to store our
     * marketing activity ID in your systems. A marketing activity ID or remote ID
     * must be provided.
     */
    public Builder remoteIdReference(String variableRef) {
      this.variableReferences.put("remoteId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("remoteId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
