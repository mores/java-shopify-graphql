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
 * Assigns the main contact for the company.
 */
public class CompanyAssignMainContactGraphQLQuery extends GraphQLQuery {
  public CompanyAssignMainContactGraphQLQuery(String companyId, String companyContactId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }
  }

  public CompanyAssignMainContactGraphQLQuery(String companyId, String companyContactId,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyAssignMainContactGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyAssignMainContact";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyId;

    private String companyContactId;

    private String queryName;

    public CompanyAssignMainContactGraphQLQuery build() {
      return new CompanyAssignMainContactGraphQLQuery(companyId, companyContactId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company to assign the main contact to.
     */
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    /**
     * The ID of the company to assign the main contact to.
     */
    public Builder companyIdReference(String variableRef) {
      this.variableReferences.put("companyId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyId");
      return this;
    }

    /**
     * The ID of the company contact to be assigned as the main contact.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The ID of the company contact to be assigned as the main contact.
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
