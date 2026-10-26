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
 * Deletes a list of companies.
 */
public class CompaniesDeleteGraphQLQuery extends GraphQLQuery {
  public CompaniesDeleteGraphQLQuery(List<String> companyIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyIds != null || fieldsSet.contains("companyIds")) {
        getInput().put("companyIds", companyIds);
    }
  }

  public CompaniesDeleteGraphQLQuery(List<String> companyIds, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyIds != null || fieldsSet.contains("companyIds")) {
        getInput().put("companyIds", companyIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompaniesDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companiesDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> companyIds;

    private String queryName;

    public CompaniesDeleteGraphQLQuery build() {
      return new CompaniesDeleteGraphQLQuery(companyIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * A list of IDs of companies to delete.
     */
    public Builder companyIds(List<String> companyIds) {
      this.companyIds = companyIds;
      this.fieldsSet.add("companyIds");
      return this;
    }

    /**
     * A list of IDs of companies to delete.
     */
    public Builder companyIdsReference(String variableRef) {
      this.variableReferences.put("companyIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("companyIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
