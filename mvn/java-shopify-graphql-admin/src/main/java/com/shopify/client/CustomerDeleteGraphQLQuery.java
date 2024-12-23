package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomerDeleteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Delete a customer. As of API version 2022-10, apps using protected customer
 * data must meet the protected customer data [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data).
 */
public class CustomerDeleteGraphQLQuery extends GraphQLQuery {
  public CustomerDeleteGraphQLQuery(CustomerDeleteInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerDeleteInput input;

    private String queryName;

    public CustomerDeleteGraphQLQuery build() {
      return new CustomerDeleteGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the customer to delete.
     */
    public Builder input(CustomerDeleteInput input) {
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
