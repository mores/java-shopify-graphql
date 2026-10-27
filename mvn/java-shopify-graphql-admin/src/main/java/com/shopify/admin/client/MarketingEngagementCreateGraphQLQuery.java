package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketingEngagementInput;
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
 * Creates a new marketing engagement for a marketing activity.
 */
public class MarketingEngagementCreateGraphQLQuery extends GraphQLQuery {
  public MarketingEngagementCreateGraphQLQuery(String marketingActivityId, String remoteId,
      MarketingEngagementInput marketingEngagement, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (remoteId != null || fieldsSet.contains("remoteId")) {
        getInput().put("remoteId", remoteId);
    }if (marketingEngagement != null || fieldsSet.contains("marketingEngagement")) {
        getInput().put("marketingEngagement", marketingEngagement);
    }
  }

  public MarketingEngagementCreateGraphQLQuery(String marketingActivityId, String remoteId,
      MarketingEngagementInput marketingEngagement, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (remoteId != null || fieldsSet.contains("remoteId")) {
        getInput().put("remoteId", remoteId);
    }if (marketingEngagement != null || fieldsSet.contains("marketingEngagement")) {
        getInput().put("marketingEngagement", marketingEngagement);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MarketingEngagementCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingEngagementCreate";
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

    private MarketingEngagementInput marketingEngagement;

    private String queryName;

    public MarketingEngagementCreateGraphQLQuery build() {
      return new MarketingEngagementCreateGraphQLQuery(marketingActivityId, remoteId, marketingEngagement, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The identifier of the marketing activity for which the engagement metrics
     * are being provided. Exactly one of marketingActivityId, remoteId, or the
     * deprecated channelHandle must be set.
     */
    public Builder marketingActivityId(String marketingActivityId) {
      this.marketingActivityId = marketingActivityId;
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    /**
     * The identifier of the marketing activity for which the engagement metrics
     * are being provided. Exactly one of marketingActivityId, remoteId, or the
     * deprecated channelHandle must be set.
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
     * marketing activity ID in your systems. Exactly one of marketingActivityId,
     * remoteId, or the deprecated channelHandle must be set.
     */
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      this.fieldsSet.add("remoteId");
      return this;
    }

    /**
     * A custom unique identifier for the marketing activity, which can be used to
     * manage the activity and send engagement metrics without having to store our
     * marketing activity ID in your systems. Exactly one of marketingActivityId,
     * remoteId, or the deprecated channelHandle must be set.
     */
    public Builder remoteIdReference(String variableRef) {
      this.variableReferences.put("remoteId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("remoteId");
      return this;
    }

    /**
     * The marketing engagement's attributes.
     */
    public Builder marketingEngagement(MarketingEngagementInput marketingEngagement) {
      this.marketingEngagement = marketingEngagement;
      this.fieldsSet.add("marketingEngagement");
      return this;
    }

    /**
     * The marketing engagement's attributes.
     */
    public Builder marketingEngagementReference(String variableRef) {
      this.variableReferences.put("marketingEngagement", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MarketingEngagementInput"))).build());
      this.fieldsSet.add("marketingEngagement");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
