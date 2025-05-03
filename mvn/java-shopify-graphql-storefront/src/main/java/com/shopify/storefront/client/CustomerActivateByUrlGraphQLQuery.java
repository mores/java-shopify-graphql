package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activates a customer with the activation url received from `customerCreate`.
 */
public class CustomerActivateByUrlGraphQLQuery extends GraphQLQuery {
  public CustomerActivateByUrlGraphQLQuery(String activationUrl, String password, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (activationUrl != null || fieldsSet.contains("activationUrl")) {
        getInput().put("activationUrl", activationUrl);
    }if (password != null || fieldsSet.contains("password")) {
        getInput().put("password", password);
    }
  }

  public CustomerActivateByUrlGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerActivateByUrl";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String activationUrl;

    private String password;

    private String queryName;

    public CustomerActivateByUrlGraphQLQuery build() {
      return new CustomerActivateByUrlGraphQLQuery(activationUrl, password, queryName, fieldsSet);
               
    }

    /**
     * The customer activation URL.
     */
    public Builder activationUrl(String activationUrl) {
      this.activationUrl = activationUrl;
      this.fieldsSet.add("activationUrl");
      return this;
    }

    /**
     * A new password set during activation.
     */
    public Builder password(String password) {
      this.password = password;
      this.fieldsSet.add("password");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
