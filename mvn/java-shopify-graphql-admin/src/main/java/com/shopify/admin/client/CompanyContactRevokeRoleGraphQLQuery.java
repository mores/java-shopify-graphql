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
 * Revokes a role on a company contact.
 */
public class CompanyContactRevokeRoleGraphQLQuery extends GraphQLQuery {
  public CompanyContactRevokeRoleGraphQLQuery(String companyContactId,
      String companyContactRoleAssignmentId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (companyContactRoleAssignmentId != null || fieldsSet.contains("companyContactRoleAssignmentId")) {
        getInput().put("companyContactRoleAssignmentId", companyContactRoleAssignmentId);
    }
  }

  public CompanyContactRevokeRoleGraphQLQuery(String companyContactId,
      String companyContactRoleAssignmentId, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (companyContactRoleAssignmentId != null || fieldsSet.contains("companyContactRoleAssignmentId")) {
        getInput().put("companyContactRoleAssignmentId", companyContactRoleAssignmentId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyContactRevokeRoleGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactRevokeRole";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyContactId;

    private String companyContactRoleAssignmentId;

    private String queryName;

    public CompanyContactRevokeRoleGraphQLQuery build() {
      return new CompanyContactRevokeRoleGraphQLQuery(companyContactId, companyContactRoleAssignmentId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the contact to revoke a role from.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The ID of the contact to revoke a role from.
     */
    public Builder companyContactIdReference(String variableRef) {
      this.variableReferences.put("companyContactId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The ID of the role assignment to revoke from a contact.
     */
    public Builder companyContactRoleAssignmentId(String companyContactRoleAssignmentId) {
      this.companyContactRoleAssignmentId = companyContactRoleAssignmentId;
      this.fieldsSet.add("companyContactRoleAssignmentId");
      return this;
    }

    /**
     * The ID of the role assignment to revoke from a contact.
     */
    public Builder companyContactRoleAssignmentIdReference(String variableRef) {
      this.variableReferences.put("companyContactRoleAssignmentId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyContactRoleAssignmentId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
