package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The number of companies for a shop.
 */
public class CompaniesCountGraphQLQuery extends GraphQLQuery {
  public CompaniesCountGraphQLQuery(String queryName) {
    super("query", queryName);
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

    private String queryName;

    public CompaniesCountGraphQLQuery build() {
      return new CompaniesCountGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
