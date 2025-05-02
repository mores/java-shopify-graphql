package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * "Resets a customer’s password with the reset password URL received from a
 * reset password email. You can send a reset password email with the [`customerRecover`](https://shopify.dev/api/storefront/latest/mutations/customerRecover) mutation."
 */
public class CustomerResetByUrlGraphQLQuery extends GraphQLQuery {
  public CustomerResetByUrlGraphQLQuery(String password, String resetUrl, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (password != null || fieldsSet.contains("password")) {
        getInput().put("password", password);
    }if (resetUrl != null || fieldsSet.contains("resetUrl")) {
        getInput().put("resetUrl", resetUrl);
    }
  }

  public CustomerResetByUrlGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerResetByUrl";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String password;

    private String resetUrl;

    private String queryName;

    public CustomerResetByUrlGraphQLQuery build() {
      return new CustomerResetByUrlGraphQLQuery(password, resetUrl, queryName, fieldsSet);
               
    }

    /**
     * New password that will be set as part of the reset password process.
     */
    public Builder password(String password) {
      this.password = password;
      this.fieldsSet.add("password");
      return this;
    }

    /**
     * The customer's reset password url.
     */
    public Builder resetUrl(String resetUrl) {
      this.resetUrl = resetUrl;
      this.fieldsSet.add("resetUrl");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
