package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CustomerUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a [customer's](https://shopify.dev/docs/api/storefront/current/objects/Customer)
 * personal information such as name, password, and marketing preferences.
 * Requires a valid [`CustomerAccessToken`](https://shopify.dev/docs/api/storefront/current/objects/CustomerAccessToken)
 * to authenticate the customer making the update.
 *   
 * If the customer's password is updated, then all previous access tokens become
 * invalid. The mutation returns a new access token in the payload to maintain
 * the customer's session.
 *   
 * > Caution:
 * > Password changes invalidate all existing access tokens. Ensure your app
 * handles the new token returned in the response to avoid logging the customer out.
 */
public class CustomerUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerUpdateGraphQLQuery(String customerAccessToken, CustomerUpdateInput customer,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (customer != null || fieldsSet.contains("customer")) {
        getInput().put("customer", customer);
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

    private String customerAccessToken;

    private CustomerUpdateInput customer;

    private String queryName;

    public CustomerUpdateGraphQLQuery build() {
      return new CustomerUpdateGraphQLQuery(customerAccessToken, customer, queryName, fieldsSet);
               
    }

    /**
     * The access token used to identify the customer.
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      this.fieldsSet.add("customerAccessToken");
      return this;
    }

    /**
     * The customer object input.
     */
    public Builder customer(CustomerUpdateInput customer) {
      this.customer = customer;
      this.fieldsSet.add("customer");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
