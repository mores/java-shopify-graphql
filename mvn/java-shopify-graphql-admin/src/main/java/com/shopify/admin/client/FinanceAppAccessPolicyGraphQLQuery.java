package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the access policy for a finance app .
 */
public class FinanceAppAccessPolicyGraphQLQuery extends GraphQLQuery {
  public FinanceAppAccessPolicyGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public FinanceAppAccessPolicyGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "financeAppAccessPolicy";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public FinanceAppAccessPolicyGraphQLQuery build() {
      return new FinanceAppAccessPolicyGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
