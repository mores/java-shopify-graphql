package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a company location.
 */
public class CompanyLocationDeleteGraphQLQuery extends GraphQLQuery {
  public CompanyLocationDeleteGraphQLQuery(String companyLocationId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }
  }

  public CompanyLocationDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyLocationId;

    private String queryName;

    public CompanyLocationDeleteGraphQLQuery build() {
      return new CompanyLocationDeleteGraphQLQuery(companyLocationId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company location to delete.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
