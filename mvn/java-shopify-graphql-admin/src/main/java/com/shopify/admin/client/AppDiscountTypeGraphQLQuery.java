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
 * An app discount type.
 */
public class AppDiscountTypeGraphQLQuery extends GraphQLQuery {
  public AppDiscountTypeGraphQLQuery(String functionId, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (functionId != null || fieldsSet.contains("functionId")) {
        getInput().put("functionId", functionId);
    }
  }

  public AppDiscountTypeGraphQLQuery(String functionId, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (functionId != null || fieldsSet.contains("functionId")) {
        getInput().put("functionId", functionId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public AppDiscountTypeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appDiscountType";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String functionId;

    private String queryName;

    public AppDiscountTypeGraphQLQuery build() {
      return new AppDiscountTypeGraphQLQuery(functionId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID for the function providing the app discount type.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      this.fieldsSet.add("functionId");
      return this;
    }

    /**
     * The ID for the function providing the app discount type.
     */
    public Builder functionIdReference(String variableRef) {
      this.variableReferences.put("functionId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("functionId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
