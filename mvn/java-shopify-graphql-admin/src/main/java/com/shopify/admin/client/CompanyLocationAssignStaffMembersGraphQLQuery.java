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
 * Creates one or more mappings between a staff member at a shop and a company location.
 */
public class CompanyLocationAssignStaffMembersGraphQLQuery extends GraphQLQuery {
  public CompanyLocationAssignStaffMembersGraphQLQuery(String companyLocationId,
      List<String> staffMemberIds, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (staffMemberIds != null || fieldsSet.contains("staffMemberIds")) {
        getInput().put("staffMemberIds", staffMemberIds);
    }
  }

  public CompanyLocationAssignStaffMembersGraphQLQuery(String companyLocationId,
      List<String> staffMemberIds, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (staffMemberIds != null || fieldsSet.contains("staffMemberIds")) {
        getInput().put("staffMemberIds", staffMemberIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyLocationAssignStaffMembersGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationAssignStaffMembers";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyLocationId;

    private List<String> staffMemberIds;

    private String queryName;

    public CompanyLocationAssignStaffMembersGraphQLQuery build() {
      return new CompanyLocationAssignStaffMembersGraphQLQuery(companyLocationId, staffMemberIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company location to assign the staff member to.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The ID of the company location to assign the staff member to.
     */
    public Builder companyLocationIdReference(String variableRef) {
      this.variableReferences.put("companyLocationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The list of IDs of the staff members to assign.
     */
    public Builder staffMemberIds(List<String> staffMemberIds) {
      this.staffMemberIds = staffMemberIds;
      this.fieldsSet.add("staffMemberIds");
      return this;
    }

    /**
     * The list of IDs of the staff members to assign.
     */
    public Builder staffMemberIdsReference(String variableRef) {
      this.variableReferences.put("staffMemberIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("staffMemberIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
