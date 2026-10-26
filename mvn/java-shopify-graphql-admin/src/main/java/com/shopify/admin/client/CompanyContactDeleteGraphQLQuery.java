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
 * Deletes a company contact.
 */
public class CompanyContactDeleteGraphQLQuery extends GraphQLQuery {
  public CompanyContactDeleteGraphQLQuery(String companyContactId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }
  }

  public CompanyContactDeleteGraphQLQuery(String companyContactId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyContactDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyContactId;

    private String queryName;

    public CompanyContactDeleteGraphQLQuery build() {
      return new CompanyContactDeleteGraphQLQuery(companyContactId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company contact to delete.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The ID of the company contact to delete.
     */
    public Builder companyContactIdReference(String variableRef) {
      this.variableReferences.put("companyContactId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyContactId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
