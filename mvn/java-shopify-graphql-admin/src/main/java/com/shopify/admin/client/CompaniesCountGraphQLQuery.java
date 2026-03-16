package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The number of companies for a shop. Limited to a maximum of 10000 by default.
 */
public class CompaniesCountGraphQLQuery extends GraphQLQuery {
  public CompaniesCountGraphQLQuery(Integer limit, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }
  }

  public CompaniesCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "companiesCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Integer limit;

    private String queryName;

    public CompaniesCountGraphQLQuery build() {
      return new CompaniesCountGraphQLQuery(limit, queryName, fieldsSet);
               
    }

    /**
     * The upper bound on count value before returning a result. Use `null` to have no limit.
     */
    public Builder limit(Integer limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
