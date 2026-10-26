package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketRegionCreateInput;
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
 * Creates regions that belong to an existing market.
 */
public class MarketRegionsCreateGraphQLQuery extends GraphQLQuery {
  public MarketRegionsCreateGraphQLQuery(String marketId, List<MarketRegionCreateInput> regions,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketId != null || fieldsSet.contains("marketId")) {
        getInput().put("marketId", marketId);
    }if (regions != null || fieldsSet.contains("regions")) {
        getInput().put("regions", regions);
    }
  }

  public MarketRegionsCreateGraphQLQuery(String marketId, List<MarketRegionCreateInput> regions,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (marketId != null || fieldsSet.contains("marketId")) {
        getInput().put("marketId", marketId);
    }if (regions != null || fieldsSet.contains("regions")) {
        getInput().put("regions", regions);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MarketRegionsCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketRegionsCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String marketId;

    private List<MarketRegionCreateInput> regions;

    private String queryName;

    public MarketRegionsCreateGraphQLQuery build() {
      return new MarketRegionsCreateGraphQLQuery(marketId, regions, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the market to add the regions to.
     */
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      this.fieldsSet.add("marketId");
      return this;
    }

    /**
     * The ID of the market to add the regions to.
     */
    public Builder marketIdReference(String variableRef) {
      this.variableReferences.put("marketId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("marketId");
      return this;
    }

    /**
     * The regions to be created.
     */
    public Builder regions(List<MarketRegionCreateInput> regions) {
      this.regions = regions;
      this.fieldsSet.add("regions");
      return this;
    }

    /**
     * The regions to be created.
     */
    public Builder regionsReference(String variableRef) {
      this.variableReferences.put("regions", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("MarketRegionCreateInput"))))).build());
      this.fieldsSet.add("regions");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
