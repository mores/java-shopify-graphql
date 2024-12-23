package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomerInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update a customer's attributes. As of API version 2022-10, apps using
 * protected customer data must meet the protected customer data [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data).
 */
public class CustomerUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerUpdateGraphQLQuery(CustomerInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerInput input;

    private String queryName;

    public CustomerUpdateGraphQLQuery build() {
      return new CustomerUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Provides updated fields for the customer. To set marketing consent, use the
     * `customerEmailMarketingConsentUpdate` or `customerSmsMarketingConsentUpdate`
     * mutations instead.
     */
    public Builder input(CustomerInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
