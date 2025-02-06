package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
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

    private String companyContactId;

    private String companyContactRoleAssignmentId;

    private String queryName;

    public CompanyContactRevokeRoleGraphQLQuery build() {
      return new CompanyContactRevokeRoleGraphQLQuery(companyContactId, companyContactRoleAssignmentId, queryName, fieldsSet);
               
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
     * The ID of the role assignment to revoke from a contact.
     */
    public Builder companyContactRoleAssignmentId(String companyContactRoleAssignmentId) {
      this.companyContactRoleAssignmentId = companyContactRoleAssignmentId;
      this.fieldsSet.add("companyContactRoleAssignmentId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
