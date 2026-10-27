package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketingActivityUpdateExternalInput;
import com.shopify.admin.types.UTMInput;
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
 * Update an external marketing activity.
 */
public class MarketingActivityUpdateExternalGraphQLQuery extends GraphQLQuery {
  public MarketingActivityUpdateExternalGraphQLQuery(MarketingActivityUpdateExternalInput input,
      String marketingActivityId, String remoteId, UTMInput utm, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (remoteId != null || fieldsSet.contains("remoteId")) {
        getInput().put("remoteId", remoteId);
    }if (utm != null || fieldsSet.contains("utm")) {
        getInput().put("utm", utm);
    }
  }

  public MarketingActivityUpdateExternalGraphQLQuery(MarketingActivityUpdateExternalInput input,
      String marketingActivityId, String remoteId, UTMInput utm, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (remoteId != null || fieldsSet.contains("remoteId")) {
        getInput().put("remoteId", remoteId);
    }if (utm != null || fieldsSet.contains("utm")) {
        getInput().put("utm", utm);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MarketingActivityUpdateExternalGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityUpdateExternal";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private MarketingActivityUpdateExternalInput input;

    private String marketingActivityId;

    private String remoteId;

    private UTMInput utm;

    private String queryName;

    public MarketingActivityUpdateExternalGraphQLQuery build() {
      return new MarketingActivityUpdateExternalGraphQLQuery(input, marketingActivityId, remoteId, utm, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input field for updating an external marketing activity.
     */
    public Builder input(MarketingActivityUpdateExternalInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input field for updating an external marketing activity.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MarketingActivityUpdateExternalInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The ID of the marketing activity. Specify either the marketing activity ID,
     * remote ID, or UTM to update the marketing activity.
     */
    public Builder marketingActivityId(String marketingActivityId) {
      this.marketingActivityId = marketingActivityId;
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    /**
     * The ID of the marketing activity. Specify either the marketing activity ID,
     * remote ID, or UTM to update the marketing activity.
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
     * marketing activity ID in your systems. Specify either the marketing activity
     * ID, remote ID, or UTM to update the marketing activity.
     */
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      this.fieldsSet.add("remoteId");
      return this;
    }

    /**
     * A custom unique identifier for the marketing activity, which can be used to
     * manage the activity and send engagement metrics without having to store our
     * marketing activity ID in your systems. Specify either the marketing activity
     * ID, remote ID, or UTM to update the marketing activity.
     */
    public Builder remoteIdReference(String variableRef) {
      this.variableReferences.put("remoteId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("remoteId");
      return this;
    }

    /**
     * Specifies the [Urchin Traffic Module (UTM)
     * parameters](https://en.wikipedia.org/wiki/UTM_parameters) that are
     * associated with a related marketing campaign. Specify either the marketing
     * activity ID, remote ID, or UTM to update the marketing activity.
     */
    public Builder utm(UTMInput utm) {
      this.utm = utm;
      this.fieldsSet.add("utm");
      return this;
    }

    /**
     * Specifies the [Urchin Traffic Module (UTM)
     * parameters](https://en.wikipedia.org/wiki/UTM_parameters) that are
     * associated with a related marketing campaign. Specify either the marketing
     * activity ID, remote ID, or UTM to update the marketing activity.
     */
    public Builder utmReference(String variableRef) {
      this.variableReferences.put("utm", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("UTMInput")).build());
      this.fieldsSet.add("utm");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
