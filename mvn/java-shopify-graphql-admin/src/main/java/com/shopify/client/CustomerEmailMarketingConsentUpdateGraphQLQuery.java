package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomerEmailMarketingConsentUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CustomerEmailMarketingConsentUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerEmailMarketingConsentUpdateGraphQLQuery(
      CustomerEmailMarketingConsentUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerEmailMarketingConsentUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerEmailMarketingConsentUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerEmailMarketingConsentUpdateInput input;

    private String queryName;

    public CustomerEmailMarketingConsentUpdateGraphQLQuery build() {
      return new CustomerEmailMarketingConsentUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(CustomerEmailMarketingConsentUpdateInput input) {
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
