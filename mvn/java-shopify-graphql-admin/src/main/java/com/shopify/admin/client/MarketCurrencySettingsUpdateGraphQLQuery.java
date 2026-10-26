package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketCurrencySettingsUpdateInput;
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
 * Updates currency settings of a market.
 */
public class MarketCurrencySettingsUpdateGraphQLQuery extends GraphQLQuery {
  public MarketCurrencySettingsUpdateGraphQLQuery(String marketId,
      MarketCurrencySettingsUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketId != null || fieldsSet.contains("marketId")) {
        getInput().put("marketId", marketId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketCurrencySettingsUpdateGraphQLQuery(String marketId,
      MarketCurrencySettingsUpdateInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (marketId != null || fieldsSet.contains("marketId")) {
        getInput().put("marketId", marketId);
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

  public MarketCurrencySettingsUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketCurrencySettingsUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String marketId;

    private MarketCurrencySettingsUpdateInput input;

    private String queryName;

    public MarketCurrencySettingsUpdateGraphQLQuery build() {
      return new MarketCurrencySettingsUpdateGraphQLQuery(marketId, input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the market definition to target.
     */
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      this.fieldsSet.add("marketId");
      return this;
    }

    /**
     * The ID of the market definition to target.
     */
    public Builder marketIdReference(String variableRef) {
      this.variableReferences.put("marketId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("marketId");
      return this;
    }

    /**
     * Properties to update for the market currency settings.
     */
    public Builder input(MarketCurrencySettingsUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Properties to update for the market currency settings.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MarketCurrencySettingsUpdateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
