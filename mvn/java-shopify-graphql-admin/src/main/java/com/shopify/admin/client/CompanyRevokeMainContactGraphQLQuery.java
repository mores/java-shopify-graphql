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
 * Revokes the main contact from the company.
 */
public class CompanyRevokeMainContactGraphQLQuery extends GraphQLQuery {
  public CompanyRevokeMainContactGraphQLQuery(String companyId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }
  }

  public CompanyRevokeMainContactGraphQLQuery(String companyId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyRevokeMainContactGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyRevokeMainContact";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyId;

    private String queryName;

    public CompanyRevokeMainContactGraphQLQuery build() {
      return new CompanyRevokeMainContactGraphQLQuery(companyId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company to revoke the main contact from.
     */
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    /**
     * The ID of the company to revoke the main contact from.
     */
    public Builder companyIdReference(String variableRef) {
      this.variableReferences.put("companyId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
