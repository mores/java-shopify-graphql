package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Revokes roles on a company contact.
 */
public class CompanyContactRevokeRolesGraphQLQuery extends GraphQLQuery {
  public CompanyContactRevokeRolesGraphQLQuery(String companyContactId,
      List<String> roleAssignmentIds, Boolean revokeAll, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (roleAssignmentIds != null || fieldsSet.contains("roleAssignmentIds")) {
        getInput().put("roleAssignmentIds", roleAssignmentIds);
    }if (revokeAll != null || fieldsSet.contains("revokeAll")) {
        getInput().put("revokeAll", revokeAll);
    }
  }

  public CompanyContactRevokeRolesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactRevokeRoles";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyContactId;

    private List<String> roleAssignmentIds;

    private Boolean revokeAll;

    private String queryName;

    public CompanyContactRevokeRolesGraphQLQuery build() {
      return new CompanyContactRevokeRolesGraphQLQuery(companyContactId, roleAssignmentIds, revokeAll, queryName, fieldsSet);
               
    }

    /**
     * The contact whose roles are being revoked.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The current role assignment IDs to revoke.
     */
    public Builder roleAssignmentIds(List<String> roleAssignmentIds) {
      this.roleAssignmentIds = roleAssignmentIds;
      this.fieldsSet.add("roleAssignmentIds");
      return this;
    }

    /**
     * Flag to revoke all roles on the contact.
     */
    public Builder revokeAll(Boolean revokeAll) {
      this.revokeAll = revokeAll;
      this.fieldsSet.add("revokeAll");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
