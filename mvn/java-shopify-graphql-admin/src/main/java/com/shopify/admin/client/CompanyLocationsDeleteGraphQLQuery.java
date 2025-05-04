package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes a list of company locations.
 */
public class CompanyLocationsDeleteGraphQLQuery extends GraphQLQuery {
  public CompanyLocationsDeleteGraphQLQuery(List<String> companyLocationIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationIds != null || fieldsSet.contains("companyLocationIds")) {
        getInput().put("companyLocationIds", companyLocationIds);
    }
  }

  public CompanyLocationsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> companyLocationIds;

    private String queryName;

    public CompanyLocationsDeleteGraphQLQuery build() {
      return new CompanyLocationsDeleteGraphQLQuery(companyLocationIds, queryName, fieldsSet);
               
    }

    /**
     * A list of IDs of company locations to delete.
     */
    public Builder companyLocationIds(List<String> companyLocationIds) {
      this.companyLocationIds = companyLocationIds;
      this.fieldsSet.add("companyLocationIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
