package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyContactInput;
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
 * Creates a company contact and the associated customer.
 */
public class CompanyContactCreateGraphQLQuery extends GraphQLQuery {
  public CompanyContactCreateGraphQLQuery(String companyId, CompanyContactInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyContactCreateGraphQLQuery(String companyId, CompanyContactInput input,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyContactCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyId;

    private CompanyContactInput input;

    private String queryName;

    public CompanyContactCreateGraphQLQuery build() {
      return new CompanyContactCreateGraphQLQuery(companyId, input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company that the company contact belongs to.
     */
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    /**
     * The ID of the company that the company contact belongs to.
     */
    public Builder companyIdReference(String variableRef) {
      this.variableReferences.put("companyId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyId");
      return this;
    }

    /**
     * The fields to use to create the company contact.
     */
    public Builder input(CompanyContactInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The fields to use to create the company contact.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CompanyContactInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
