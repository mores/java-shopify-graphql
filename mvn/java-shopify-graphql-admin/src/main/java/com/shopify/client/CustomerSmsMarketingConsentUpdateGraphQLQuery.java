package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomerSmsMarketingConsentUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CustomerSmsMarketingConsentUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerSmsMarketingConsentUpdateGraphQLQuery(CustomerSmsMarketingConsentUpdateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerSmsMarketingConsentUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerSmsMarketingConsentUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerSmsMarketingConsentUpdateInput input;

    private String queryName;

    public CustomerSmsMarketingConsentUpdateGraphQLQuery build() {
      return new CustomerSmsMarketingConsentUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(CustomerSmsMarketingConsentUpdateInput input) {
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
