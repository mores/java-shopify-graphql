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
 * Destroys a delegate access token.
 */
public class DelegateAccessTokenDestroyGraphQLQuery extends GraphQLQuery {
  public DelegateAccessTokenDestroyGraphQLQuery(String accessToken, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (accessToken != null || fieldsSet.contains("accessToken")) {
        getInput().put("accessToken", accessToken);
    }
  }

  public DelegateAccessTokenDestroyGraphQLQuery(String accessToken, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (accessToken != null || fieldsSet.contains("accessToken")) {
        getInput().put("accessToken", accessToken);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DelegateAccessTokenDestroyGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "delegateAccessTokenDestroy";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String accessToken;

    private String queryName;

    public DelegateAccessTokenDestroyGraphQLQuery build() {
      return new DelegateAccessTokenDestroyGraphQLQuery(accessToken, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Provides the delegate access token to destroy.
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      this.fieldsSet.add("accessToken");
      return this;
    }

    /**
     * Provides the delegate access token to destroy.
     */
    public Builder accessTokenReference(String variableRef) {
      this.variableReferences.put("accessToken", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("accessToken");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
