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
 * Deletes one or more company contacts.
 */
public class CompanyContactsDeleteGraphQLQuery extends GraphQLQuery {
  public CompanyContactsDeleteGraphQLQuery(List<String> companyContactIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactIds != null || fieldsSet.contains("companyContactIds")) {
        getInput().put("companyContactIds", companyContactIds);
    }
  }

  public CompanyContactsDeleteGraphQLQuery(List<String> companyContactIds, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyContactIds != null || fieldsSet.contains("companyContactIds")) {
        getInput().put("companyContactIds", companyContactIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyContactsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> companyContactIds;

    private String queryName;

    public CompanyContactsDeleteGraphQLQuery build() {
      return new CompanyContactsDeleteGraphQLQuery(companyContactIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The list of IDs of the company contacts to delete.
     */
    public Builder companyContactIds(List<String> companyContactIds) {
      this.companyContactIds = companyContactIds;
      this.fieldsSet.add("companyContactIds");
      return this;
    }

    /**
     * The list of IDs of the company contacts to delete.
     */
    public Builder companyContactIdsReference(String variableRef) {
      this.variableReferences.put("companyContactIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("companyContactIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
