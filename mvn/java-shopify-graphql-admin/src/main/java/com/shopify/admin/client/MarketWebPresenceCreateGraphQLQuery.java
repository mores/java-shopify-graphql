package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketWebPresenceCreateInput;
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
 * Creates a web presence for a market.
 */
public class MarketWebPresenceCreateGraphQLQuery extends GraphQLQuery {
  public MarketWebPresenceCreateGraphQLQuery(String marketId,
      MarketWebPresenceCreateInput webPresence, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketId != null || fieldsSet.contains("marketId")) {
        getInput().put("marketId", marketId);
    }if (webPresence != null || fieldsSet.contains("webPresence")) {
        getInput().put("webPresence", webPresence);
    }
  }

  public MarketWebPresenceCreateGraphQLQuery(String marketId,
      MarketWebPresenceCreateInput webPresence, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (marketId != null || fieldsSet.contains("marketId")) {
        getInput().put("marketId", marketId);
    }if (webPresence != null || fieldsSet.contains("webPresence")) {
        getInput().put("webPresence", webPresence);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MarketWebPresenceCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketWebPresenceCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String marketId;

    private MarketWebPresenceCreateInput webPresence;

    private String queryName;

    public MarketWebPresenceCreateGraphQLQuery build() {
      return new MarketWebPresenceCreateGraphQLQuery(marketId, webPresence, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the market for which to create a web presence.
     */
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      this.fieldsSet.add("marketId");
      return this;
    }

    /**
     * The ID of the market for which to create a web presence.
     */
    public Builder marketIdReference(String variableRef) {
      this.variableReferences.put("marketId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("marketId");
      return this;
    }

    /**
     * The details of the web presence to be created.
     */
    public Builder webPresence(MarketWebPresenceCreateInput webPresence) {
      this.webPresence = webPresence;
      this.fieldsSet.add("webPresence");
      return this;
    }

    /**
     * The details of the web presence to be created.
     */
    public Builder webPresenceReference(String variableRef) {
      this.variableReferences.put("webPresence", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MarketWebPresenceCreateInput"))).build());
      this.fieldsSet.add("webPresence");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
