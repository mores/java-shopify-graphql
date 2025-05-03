package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CustomerActivateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activates a customer.
 */
public class CustomerActivateGraphQLQuery extends GraphQLQuery {
  public CustomerActivateGraphQLQuery(String id, CustomerActivateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private CustomerActivateInput input;

    private String queryName;

    public CustomerActivateGraphQLQuery build() {
      return new CustomerActivateGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the customer to activate.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The fields used to activate a customer.
     */
    public Builder input(CustomerActivateInput input) {
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
