package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.StoreCreditAccountDebitInput;
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
 * Creates a debit transaction that decreases the store credit account balance by the given amount.
 */
public class StoreCreditAccountDebitGraphQLQuery extends GraphQLQuery {
  public StoreCreditAccountDebitGraphQLQuery(String id, StoreCreditAccountDebitInput debitInput,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (debitInput != null || fieldsSet.contains("debitInput")) {
        getInput().put("debitInput", debitInput);
    }
  }

  public StoreCreditAccountDebitGraphQLQuery(String id, StoreCreditAccountDebitInput debitInput,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (debitInput != null || fieldsSet.contains("debitInput")) {
        getInput().put("debitInput", debitInput);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public StoreCreditAccountDebitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "storeCreditAccountDebit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private StoreCreditAccountDebitInput debitInput;

    private String queryName;

    public StoreCreditAccountDebitGraphQLQuery build() {
      return new StoreCreditAccountDebitGraphQLQuery(id, debitInput, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the store credit account or the ID of the account owner.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the store credit account or the ID of the account owner.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields for a store credit account debit transaction.
     */
    public Builder debitInput(StoreCreditAccountDebitInput debitInput) {
      this.debitInput = debitInput;
      this.fieldsSet.add("debitInput");
      return this;
    }

    /**
     * The input fields for a store credit account debit transaction.
     */
    public Builder debitInputReference(String variableRef) {
      this.variableReferences.put("debitInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("StoreCreditAccountDebitInput"))).build());
      this.fieldsSet.add("debitInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
