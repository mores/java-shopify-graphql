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
 * Deletes one or more existing mappings between a staff member at a shop and a company location.
 */
public class CompanyLocationRemoveStaffMembersGraphQLQuery extends GraphQLQuery {
  public CompanyLocationRemoveStaffMembersGraphQLQuery(
      List<String> companyLocationStaffMemberAssignmentIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationStaffMemberAssignmentIds != null || fieldsSet.contains("companyLocationStaffMemberAssignmentIds")) {
        getInput().put("companyLocationStaffMemberAssignmentIds", companyLocationStaffMemberAssignmentIds);
    }
  }

  public CompanyLocationRemoveStaffMembersGraphQLQuery(
      List<String> companyLocationStaffMemberAssignmentIds, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyLocationStaffMemberAssignmentIds != null || fieldsSet.contains("companyLocationStaffMemberAssignmentIds")) {
        getInput().put("companyLocationStaffMemberAssignmentIds", companyLocationStaffMemberAssignmentIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyLocationRemoveStaffMembersGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationRemoveStaffMembers";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> companyLocationStaffMemberAssignmentIds;

    private String queryName;

    public CompanyLocationRemoveStaffMembersGraphQLQuery build() {
      return new CompanyLocationRemoveStaffMembersGraphQLQuery(companyLocationStaffMemberAssignmentIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The list of IDs of the company location staff member assignment to delete.
     */
    public Builder companyLocationStaffMemberAssignmentIds(
        List<String> companyLocationStaffMemberAssignmentIds) {
      this.companyLocationStaffMemberAssignmentIds = companyLocationStaffMemberAssignmentIds;
      this.fieldsSet.add("companyLocationStaffMemberAssignmentIds");
      return this;
    }

    /**
     * The list of IDs of the company location staff member assignment to delete.
     */
    public Builder companyLocationStaffMemberAssignmentIdsReference(String variableRef) {
      this.variableReferences.put("companyLocationStaffMemberAssignmentIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("companyLocationStaffMemberAssignmentIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
