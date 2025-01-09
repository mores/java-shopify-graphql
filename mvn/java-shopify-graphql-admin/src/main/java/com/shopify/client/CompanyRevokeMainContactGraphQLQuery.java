package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Revokes the main contact from the company.
 */
public class CompanyRevokeMainContactGraphQLQuery extends GraphQLQuery {
  public CompanyRevokeMainContactGraphQLQuery(String companyId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }
  }

  public CompanyRevokeMainContactGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyRevokeMainContact";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyId;

    private String queryName;

    public CompanyRevokeMainContactGraphQLQuery build() {
      return new CompanyRevokeMainContactGraphQLQuery(companyId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company to revoke the main contact from.
     */
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
