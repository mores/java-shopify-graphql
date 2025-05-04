package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the KYC information for the shop's Shopify Payments account, used in embedded finance apps.
 */
public class FinanceKycInformationGraphQLQuery extends GraphQLQuery {
  public FinanceKycInformationGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public FinanceKycInformationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "financeKycInformation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public FinanceKycInformationGraphQLQuery build() {
      return new FinanceKycInformationGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
