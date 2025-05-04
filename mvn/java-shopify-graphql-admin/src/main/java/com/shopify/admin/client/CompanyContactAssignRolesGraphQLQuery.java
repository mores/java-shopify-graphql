package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyContactRoleAssign;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Assigns roles on a company contact.
 */
public class CompanyContactAssignRolesGraphQLQuery extends GraphQLQuery {
  public CompanyContactAssignRolesGraphQLQuery(String companyContactId,
      List<CompanyContactRoleAssign> rolesToAssign, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (rolesToAssign != null || fieldsSet.contains("rolesToAssign")) {
        getInput().put("rolesToAssign", rolesToAssign);
    }
  }

  public CompanyContactAssignRolesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactAssignRoles";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyContactId;

    private List<CompanyContactRoleAssign> rolesToAssign;

    private String queryName;

    public CompanyContactAssignRolesGraphQLQuery build() {
      return new CompanyContactAssignRolesGraphQLQuery(companyContactId, rolesToAssign, queryName, fieldsSet);
               
    }

    /**
     * The contact whose roles are being assigned.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The new roles to assign.
     */
    public Builder rolesToAssign(List<CompanyContactRoleAssign> rolesToAssign) {
      this.rolesToAssign = rolesToAssign;
      this.fieldsSet.add("rolesToAssign");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
