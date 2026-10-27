package com.shopify.storefront.client;

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
 * A poll for the status of the cart checkout completion and order creation.
 */
public class CartCompletionAttemptGraphQLQuery extends GraphQLQuery {
  public CartCompletionAttemptGraphQLQuery(String attemptId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (attemptId != null || fieldsSet.contains("attemptId")) {
        getInput().put("attemptId", attemptId);
    }
  }

  public CartCompletionAttemptGraphQLQuery(String attemptId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (attemptId != null || fieldsSet.contains("attemptId")) {
        getInput().put("attemptId", attemptId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartCompletionAttemptGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "cartCompletionAttempt";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String attemptId;

    private String queryName;

    public CartCompletionAttemptGraphQLQuery build() {
      return new CartCompletionAttemptGraphQLQuery(attemptId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the attempt.
     */
    public Builder attemptId(String attemptId) {
      this.attemptId = attemptId;
      this.fieldsSet.add("attemptId");
      return this;
    }

    /**
     * The ID of the attempt.
     */
    public Builder attemptIdReference(String variableRef) {
      this.variableReferences.put("attemptId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("attemptId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
