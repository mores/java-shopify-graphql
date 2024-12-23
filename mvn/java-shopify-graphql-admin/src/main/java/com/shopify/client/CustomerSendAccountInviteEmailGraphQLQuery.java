package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.EmailInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sends the customer an account invite email.
 */
public class CustomerSendAccountInviteEmailGraphQLQuery extends GraphQLQuery {
  public CustomerSendAccountInviteEmailGraphQLQuery(String customerId, EmailInput email,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public CustomerSendAccountInviteEmailGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerSendAccountInviteEmail";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private EmailInput email;

    private String queryName;

    public CustomerSendAccountInviteEmailGraphQLQuery build() {
      return new CustomerSendAccountInviteEmailGraphQLQuery(customerId, email, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer to whom an account invite email is to be sent.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * Specifies the account invite email fields.
     */
    public Builder email(EmailInput email) {
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
