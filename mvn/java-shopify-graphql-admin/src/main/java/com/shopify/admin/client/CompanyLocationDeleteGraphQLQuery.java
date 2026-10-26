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
 * Deletes a company location.
 */
public class CompanyLocationDeleteGraphQLQuery extends GraphQLQuery {
  public CompanyLocationDeleteGraphQLQuery(String companyLocationId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }
  }

  public CompanyLocationDeleteGraphQLQuery(String companyLocationId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyLocationDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyLocationId;

    private String queryName;

    public CompanyLocationDeleteGraphQLQuery build() {
      return new CompanyLocationDeleteGraphQLQuery(companyLocationId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company location to delete.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The ID of the company location to delete.
     */
    public Builder companyLocationIdReference(String variableRef) {
      this.variableReferences.put("companyLocationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
