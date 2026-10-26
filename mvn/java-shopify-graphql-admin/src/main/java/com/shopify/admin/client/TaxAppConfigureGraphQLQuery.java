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
 * Allows tax app configurations for tax partners.
 */
public class TaxAppConfigureGraphQLQuery extends GraphQLQuery {
  public TaxAppConfigureGraphQLQuery(boolean ready, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    getInput().put("ready", ready);                   
  }

  public TaxAppConfigureGraphQLQuery(boolean ready, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    getInput().put("ready", ready);                   
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public TaxAppConfigureGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "taxAppConfigure";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private boolean ready;

    private String queryName;

    public TaxAppConfigureGraphQLQuery build() {
      return new TaxAppConfigureGraphQLQuery(ready, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Configures whether the tax app is correctly configured and ready to be used.
     */
    public Builder ready(boolean ready) {
      this.ready = ready;
      this.fieldsSet.add("ready");
      return this;
    }

    /**
     * Configures whether the tax app is correctly configured and ready to be used.
     */
    public Builder readyReference(String variableRef) {
      this.variableReferences.put("ready", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Boolean"))).build());
      this.fieldsSet.add("ready");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
