package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.EmailInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sends an email invoice for a draft order.
 */
public class DraftOrderInvoiceSendGraphQLQuery extends GraphQLQuery {
  public DraftOrderInvoiceSendGraphQLQuery(String id, EmailInput email, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public DraftOrderInvoiceSendGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderInvoiceSend";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private EmailInput email;

    private String queryName;

    public DraftOrderInvoiceSendGraphQLQuery build() {
      return new DraftOrderInvoiceSendGraphQLQuery(id, email, queryName, fieldsSet);
               
    }

    /**
     * Specifies the draft order to send the invoice for.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Specifies the draft order invoice email fields.
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
