package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.EmailInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sends an email invoice for an order.
 */
public class OrderInvoiceSendGraphQLQuery extends GraphQLQuery {
  public OrderInvoiceSendGraphQLQuery(String id, EmailInput email, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public OrderInvoiceSendGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderInvoiceSend";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private EmailInput email;

    private String queryName;

    public OrderInvoiceSendGraphQLQuery build() {
      return new OrderInvoiceSendGraphQLQuery(id, email, queryName, fieldsSet);
               
    }

    /**
     * The order associated with the invoice.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The email input fields for the order invoice. The `bcc` and `from` fields should be store or staff account emails.
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
