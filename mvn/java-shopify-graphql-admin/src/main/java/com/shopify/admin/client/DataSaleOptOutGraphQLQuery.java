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
 * Opt out a customer from data sale.
 */
public class DataSaleOptOutGraphQLQuery extends GraphQLQuery {
  public DataSaleOptOutGraphQLQuery(String email, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public DataSaleOptOutGraphQLQuery(String email, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DataSaleOptOutGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "dataSaleOptOut";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String email;

    private String queryName;

    public DataSaleOptOutGraphQLQuery build() {
      return new DataSaleOptOutGraphQLQuery(email, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The email address of the customer to opt out of data sale.
     */
    public Builder email(String email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    /**
     * The email address of the customer to opt out of data sale.
     */
    public Builder emailReference(String variableRef) {
      this.variableReferences.put("email", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("email");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
