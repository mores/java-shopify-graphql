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
 * Trigger the voiding of an uncaptured authorization transaction.
 */
public class TransactionVoidGraphQLQuery extends GraphQLQuery {
  public TransactionVoidGraphQLQuery(String parentTransactionId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (parentTransactionId != null || fieldsSet.contains("parentTransactionId")) {
        getInput().put("parentTransactionId", parentTransactionId);
    }
  }

  public TransactionVoidGraphQLQuery(String parentTransactionId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (parentTransactionId != null || fieldsSet.contains("parentTransactionId")) {
        getInput().put("parentTransactionId", parentTransactionId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public TransactionVoidGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "transactionVoid";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String parentTransactionId;

    private String queryName;

    public TransactionVoidGraphQLQuery build() {
      return new TransactionVoidGraphQLQuery(parentTransactionId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * An uncaptured authorization transaction.
     */
    public Builder parentTransactionId(String parentTransactionId) {
      this.parentTransactionId = parentTransactionId;
      this.fieldsSet.add("parentTransactionId");
      return this;
    }

    /**
     * An uncaptured authorization transaction.
     */
    public Builder parentTransactionIdReference(String variableRef) {
      this.variableReferences.put("parentTransactionId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("parentTransactionId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
