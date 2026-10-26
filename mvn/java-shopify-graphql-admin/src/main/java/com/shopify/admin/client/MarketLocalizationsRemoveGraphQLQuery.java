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
 * Deletes market localizations.
 */
public class MarketLocalizationsRemoveGraphQLQuery extends GraphQLQuery {
  public MarketLocalizationsRemoveGraphQLQuery(String resourceId,
      List<String> marketLocalizationKeys, List<String> marketIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (resourceId != null || fieldsSet.contains("resourceId")) {
        getInput().put("resourceId", resourceId);
    }if (marketLocalizationKeys != null || fieldsSet.contains("marketLocalizationKeys")) {
        getInput().put("marketLocalizationKeys", marketLocalizationKeys);
    }if (marketIds != null || fieldsSet.contains("marketIds")) {
        getInput().put("marketIds", marketIds);
    }
  }

  public MarketLocalizationsRemoveGraphQLQuery(String resourceId,
      List<String> marketLocalizationKeys, List<String> marketIds, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (resourceId != null || fieldsSet.contains("resourceId")) {
        getInput().put("resourceId", resourceId);
    }if (marketLocalizationKeys != null || fieldsSet.contains("marketLocalizationKeys")) {
        getInput().put("marketLocalizationKeys", marketLocalizationKeys);
    }if (marketIds != null || fieldsSet.contains("marketIds")) {
        getInput().put("marketIds", marketIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MarketLocalizationsRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketLocalizationsRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String resourceId;

    private List<String> marketLocalizationKeys;

    private List<String> marketIds;

    private String queryName;

    public MarketLocalizationsRemoveGraphQLQuery build() {
      return new MarketLocalizationsRemoveGraphQLQuery(resourceId, marketLocalizationKeys, marketIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the resource for which market localizations are being deleted.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      this.fieldsSet.add("resourceId");
      return this;
    }

    /**
     * The ID of the resource for which market localizations are being deleted.
     */
    public Builder resourceIdReference(String variableRef) {
      this.variableReferences.put("resourceId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("resourceId");
      return this;
    }

    /**
     * The list of market localization keys.
     */
    public Builder marketLocalizationKeys(List<String> marketLocalizationKeys) {
      this.marketLocalizationKeys = marketLocalizationKeys;
      this.fieldsSet.add("marketLocalizationKeys");
      return this;
    }

    /**
     * The list of market localization keys.
     */
    public Builder marketLocalizationKeysReference(String variableRef) {
      this.variableReferences.put("marketLocalizationKeys", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))))).build());
      this.fieldsSet.add("marketLocalizationKeys");
      return this;
    }

    /**
     * The list of market IDs.
     */
    public Builder marketIds(List<String> marketIds) {
      this.marketIds = marketIds;
      this.fieldsSet.add("marketIds");
      return this;
    }

    /**
     * The list of market IDs.
     */
    public Builder marketIdsReference(String variableRef) {
      this.variableReferences.put("marketIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("marketIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
