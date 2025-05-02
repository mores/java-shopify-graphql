package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sends a reset password email to the customer. The reset password
 * email contains a reset password URL and token that you can pass to
 * the [`customerResetByUrl`](https://shopify.dev/api/storefront/latest/mutations/customerResetByUrl) or
 * [`customerReset`](https://shopify.dev/api/storefront/latest/mutations/customerReset) mutation to reset the
 * customer password.
 *   
 * This mutation is throttled by IP. With private access,
 * you can provide a [`Shopify-Storefront-Buyer-IP`](https://shopify.dev/api/usage/authentication#optional-ip-header)
 * instead of the request IP.
 * The header is case-sensitive and must be sent as `Shopify-Storefront-Buyer-IP`.
 *   
 * Make sure that the value provided to `Shopify-Storefront-Buyer-IP` is trusted. Unthrottled access to this
 * mutation presents a security risk.
 */
public class CustomerRecoverGraphQLQuery extends GraphQLQuery {
  public CustomerRecoverGraphQLQuery(String email, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public CustomerRecoverGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerRecover";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String email;

    private String queryName;

    public CustomerRecoverGraphQLQuery build() {
      return new CustomerRecoverGraphQLQuery(email, queryName, fieldsSet);
               
    }

    /**
     * The email address of the customer to recover.
     */
    public Builder email(String email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
