package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves the [`Customer`](https://shopify.dev/docs/api/storefront/current/objects/Customer)
 * associated with the provided access token. Use the [`customerAccessTokenCreate`](https://shopify.dev/docs/api/storefront/current/mutations/customerAccessTokenCreate)
 * mutation to obtain an access token using legacy customer account
 * authentication (email and password).
 *   
 * The returned customer includes data such as contact information, [addresses](https://shopify.dev/docs/api/storefront/current/objects/MailingAddress),
 * [orders](https://shopify.dev/docs/api/storefront/current/objects/Order), and
 * [custom data](https://shopify.dev/docs/apps/build/custom-data) associated with the customer.
 */
public class CustomerGraphQLQuery extends GraphQLQuery {
  public CustomerGraphQLQuery(String customerAccessToken, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }
  }

  public CustomerGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customer";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerAccessToken;

    private String queryName;

    public CustomerGraphQLQuery build() {
      return new CustomerGraphQLQuery(customerAccessToken, queryName, fieldsSet);
               
    }

    /**
     * The customer access token.
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      this.fieldsSet.add("customerAccessToken");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
