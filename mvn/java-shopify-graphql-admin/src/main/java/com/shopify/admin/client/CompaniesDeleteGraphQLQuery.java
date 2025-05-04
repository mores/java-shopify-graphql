package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes a list of companies.
 */
public class CompaniesDeleteGraphQLQuery extends GraphQLQuery {
  public CompaniesDeleteGraphQLQuery(List<String> companyIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyIds != null || fieldsSet.contains("companyIds")) {
        getInput().put("companyIds", companyIds);
    }
  }

  public CompaniesDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companiesDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> companyIds;

    private String queryName;

    public CompaniesDeleteGraphQLQuery build() {
      return new CompaniesDeleteGraphQLQuery(companyIds, queryName, fieldsSet);
               
    }

    /**
     * A list of IDs of companies to delete.
     */
    public Builder companyIds(List<String> companyIds) {
      this.companyIds = companyIds;
      this.fieldsSet.add("companyIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
