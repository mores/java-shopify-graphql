package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomerResetInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * "Resets a customer’s password with the token received from a reset password
 * email. You can send a reset password email with the [`customerRecover`](https://shopify.dev/api/storefront/latest/mutations/customerRecover) mutation."
 */
public class CustomerResetGraphQLQuery extends GraphQLQuery {
  public CustomerResetGraphQLQuery(String id, CustomerResetInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerResetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerReset";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private CustomerResetInput input;

    private String queryName;

    public CustomerResetGraphQLQuery build() {
      return new CustomerResetGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the customer to reset.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The fields used to reset a customer’s password.
     */
    public Builder input(CustomerResetInput input) {
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
