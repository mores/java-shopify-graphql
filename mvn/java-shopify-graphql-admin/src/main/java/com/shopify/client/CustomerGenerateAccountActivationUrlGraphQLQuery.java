package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Generate an account activation URL for a customer.
 */
public class CustomerGenerateAccountActivationUrlGraphQLQuery extends GraphQLQuery {
  public CustomerGenerateAccountActivationUrlGraphQLQuery(String customerId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
  }

  public CustomerGenerateAccountActivationUrlGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerGenerateAccountActivationUrl";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private String queryName;

    public CustomerGenerateAccountActivationUrlGraphQLQuery build() {
      return new CustomerGenerateAccountActivationUrlGraphQLQuery(customerId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer that the URL is generated for.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
