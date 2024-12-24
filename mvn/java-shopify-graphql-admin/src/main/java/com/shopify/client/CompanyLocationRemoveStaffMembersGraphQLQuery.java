package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CompanyLocationRemoveStaffMembersGraphQLQuery extends GraphQLQuery {
  public CompanyLocationRemoveStaffMembersGraphQLQuery(
      List<String> companyLocationStaffMemberAssignmentIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationStaffMemberAssignmentIds != null || fieldsSet.contains("companyLocationStaffMemberAssignmentIds")) {
        getInput().put("companyLocationStaffMemberAssignmentIds", companyLocationStaffMemberAssignmentIds);
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

    private List<String> companyLocationStaffMemberAssignmentIds;

    private String queryName;

    public CompanyLocationRemoveStaffMembersGraphQLQuery build() {
      return new CompanyLocationRemoveStaffMembersGraphQLQuery(companyLocationStaffMemberAssignmentIds, queryName, fieldsSet);
               
    }

    
    public Builder companyLocationStaffMemberAssignmentIds(
        List<String> companyLocationStaffMemberAssignmentIds) {
      this.companyLocationStaffMemberAssignmentIds = companyLocationStaffMemberAssignmentIds;
      this.fieldsSet.add("companyLocationStaffMemberAssignmentIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
