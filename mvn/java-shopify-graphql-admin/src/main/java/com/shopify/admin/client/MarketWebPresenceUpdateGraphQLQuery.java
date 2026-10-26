package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketWebPresenceUpdateInput;
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
 * Updates a market web presence.
 */
public class MarketWebPresenceUpdateGraphQLQuery extends GraphQLQuery {
  public MarketWebPresenceUpdateGraphQLQuery(String webPresenceId,
      MarketWebPresenceUpdateInput webPresence, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (webPresenceId != null || fieldsSet.contains("webPresenceId")) {
        getInput().put("webPresenceId", webPresenceId);
    }if (webPresence != null || fieldsSet.contains("webPresence")) {
        getInput().put("webPresence", webPresence);
    }
  }

  public MarketWebPresenceUpdateGraphQLQuery(String webPresenceId,
      MarketWebPresenceUpdateInput webPresence, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (webPresenceId != null || fieldsSet.contains("webPresenceId")) {
        getInput().put("webPresenceId", webPresenceId);
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

  public MarketWebPresenceUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketWebPresenceUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String webPresenceId;

    private MarketWebPresenceUpdateInput webPresence;

    private String queryName;

    public MarketWebPresenceUpdateGraphQLQuery build() {
      return new MarketWebPresenceUpdateGraphQLQuery(webPresenceId, webPresence, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the web presence to update.
     */
    public Builder webPresenceId(String webPresenceId) {
      this.webPresenceId = webPresenceId;
      this.fieldsSet.add("webPresenceId");
      return this;
    }

    /**
     * The ID of the web presence to update.
     */
    public Builder webPresenceIdReference(String variableRef) {
      this.variableReferences.put("webPresenceId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("webPresenceId");
      return this;
    }

    /**
     * The web_presence fields used to update the market's web presence.
     */
    public Builder webPresence(MarketWebPresenceUpdateInput webPresence) {
      this.webPresence = webPresence;
      this.fieldsSet.add("webPresence");
      return this;
    }

    /**
     * The web_presence fields used to update the market's web presence.
     */
    public Builder webPresenceReference(String variableRef) {
      this.variableReferences.put("webPresence", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MarketWebPresenceUpdateInput"))).build());
      this.fieldsSet.add("webPresence");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
