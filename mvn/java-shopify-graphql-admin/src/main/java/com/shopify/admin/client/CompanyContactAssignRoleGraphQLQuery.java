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
 * Assigns a role to a contact for a location.
 */
public class CompanyContactAssignRoleGraphQLQuery extends GraphQLQuery {
  public CompanyContactAssignRoleGraphQLQuery(String companyContactId, String companyContactRoleId,
      String companyLocationId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (companyContactRoleId != null || fieldsSet.contains("companyContactRoleId")) {
        getInput().put("companyContactRoleId", companyContactRoleId);
    }if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }
  }

  public CompanyContactAssignRoleGraphQLQuery(String companyContactId, String companyContactRoleId,
      String companyLocationId, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (companyContactRoleId != null || fieldsSet.contains("companyContactRoleId")) {
        getInput().put("companyContactRoleId", companyContactRoleId);
    }if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyContactAssignRoleGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactAssignRole";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyContactId;

    private String companyContactRoleId;

    private String companyLocationId;

    private String queryName;

    public CompanyContactAssignRoleGraphQLQuery build() {
      return new CompanyContactAssignRoleGraphQLQuery(companyContactId, companyContactRoleId, companyLocationId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the contact to assign a role to.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The ID of the contact to assign a role to.
     */
    public Builder companyContactIdReference(String variableRef) {
      this.variableReferences.put("companyContactId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The ID of the role to assign to a contact.
     */
    public Builder companyContactRoleId(String companyContactRoleId) {
      this.companyContactRoleId = companyContactRoleId;
      this.fieldsSet.add("companyContactRoleId");
      return this;
    }

    /**
     * The ID of the role to assign to a contact.
     */
    public Builder companyContactRoleIdReference(String variableRef) {
      this.variableReferences.put("companyContactRoleId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyContactRoleId");
      return this;
    }

    /**
     * The ID of the location to assign a role to a contact.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The ID of the location to assign a role to a contact.
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
