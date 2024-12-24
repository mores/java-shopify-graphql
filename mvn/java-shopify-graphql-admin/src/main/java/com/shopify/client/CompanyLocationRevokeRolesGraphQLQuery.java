package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CompanyLocationRevokeRolesGraphQLQuery extends GraphQLQuery {
  public CompanyLocationRevokeRolesGraphQLQuery(String companyLocationId,
      List<String> rolesToRevoke, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (rolesToRevoke != null || fieldsSet.contains("rolesToRevoke")) {
        getInput().put("rolesToRevoke", rolesToRevoke);
    }
  }

  public CompanyLocationRevokeRolesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationRevokeRoles";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyLocationId;

    private List<String> rolesToRevoke;

    private String queryName;

    public CompanyLocationRevokeRolesGraphQLQuery build() {
      return new CompanyLocationRevokeRolesGraphQLQuery(companyLocationId, rolesToRevoke, queryName, fieldsSet);
               
    }

    
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    
    public Builder rolesToRevoke(List<String> rolesToRevoke) {
      this.rolesToRevoke = rolesToRevoke;
      this.fieldsSet.add("rolesToRevoke");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
