package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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

    private String companyLocationId;

    private List<String> staffMemberIds;

    private String queryName;

    public CompanyLocationAssignStaffMembersGraphQLQuery build() {
      return new CompanyLocationAssignStaffMembersGraphQLQuery(companyLocationId, staffMemberIds, queryName, fieldsSet);
               
    }

    
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    
    public Builder staffMemberIds(List<String> staffMemberIds) {
      this.staffMemberIds = staffMemberIds;
      this.fieldsSet.add("staffMemberIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
