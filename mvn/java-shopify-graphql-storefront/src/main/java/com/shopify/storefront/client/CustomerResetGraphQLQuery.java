package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CustomerResetInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Resets a customer's password using the reset token from a password recovery
 * email. On success, returns the updated
 * [`Customer`](https://shopify.dev/docs/api/storefront/current/objects/Customer) and a new [`CustomerAccessToken`](https://shopify.dev/docs/api/storefront/current/objects/CustomerAccessToken)
 * for immediate authentication.
 *   
 * Use the [`customerRecover`](https://shopify.dev/docs/api/storefront/current/mutations/customerRecover) mutation to send the password recovery email that provides the reset token.
 * Alternatively, use [`customerResetByUrl`](https://shopify.dev/docs/api/storefront/current/mutations/customerResetByUrl)
 * if you have the full reset URL instead of the customer ID and token.
 *   
 * > Caution:
 * > This mutation handles sensitive customer credentials. Validate password requirements on the client before submission.
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
