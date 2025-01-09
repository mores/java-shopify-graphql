package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Send notification to the customer of a gift card.
 */
public class GiftCardSendNotificationToCustomerGraphQLQuery extends GraphQLQuery {
  public GiftCardSendNotificationToCustomerGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public GiftCardSendNotificationToCustomerGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "giftCardSendNotificationToCustomer";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public GiftCardSendNotificationToCustomerGraphQLQuery build() {
      return new GiftCardSendNotificationToCustomerGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the gift card to send.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
