package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Returns Know Your Customer (KYC) information for the shop's Shopify Payments
 * account. KYC data includes verified identity and business details collected
 * during onboarding. This is primarily used by embedded finance apps (e.g.,
 * Shopify Balance, Bill Pay) that need to verify the merchant's identity without
 * requiring a separate KYC process.
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

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
