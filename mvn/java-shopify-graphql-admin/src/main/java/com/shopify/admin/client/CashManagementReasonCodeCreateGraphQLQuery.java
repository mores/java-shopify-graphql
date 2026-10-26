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
 * Create a cash management reason code.
 */
public class CashManagementReasonCodeCreateGraphQLQuery extends GraphQLQuery {
  public CashManagementReasonCodeCreateGraphQLQuery(String code, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (code != null || fieldsSet.contains("code")) {
        getInput().put("code", code);
    }
  }

  public CashManagementReasonCodeCreateGraphQLQuery(String code, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (code != null || fieldsSet.contains("code")) {
        getInput().put("code", code);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CashManagementReasonCodeCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cashManagementReasonCodeCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String code;

    private String queryName;

    public CashManagementReasonCodeCreateGraphQLQuery build() {
      return new CashManagementReasonCodeCreateGraphQLQuery(code, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The reason code to create.
     */
    public Builder code(String code) {
      this.code = code;
      this.fieldsSet.add("code");
      return this;
    }

    /**
     * The reason code to create.
     */
    public Builder codeReference(String variableRef) {
      this.variableReferences.put("code", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("code");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
