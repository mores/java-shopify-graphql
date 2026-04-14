package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.GiftCardCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new [`GiftCard`](https://shopify.dev/docs/api/admin-graphql/latest/objects/GiftCard) with a specified initial value. You can assign the gift card to a [`Customer`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
 * or create it without assignment for manual distribution.
 *   
 * You can customize the gift card with an optional code, expiration date, and
 * internal note. If you don't provide a code, the system generates a random 16
 * character alphanumeric code. The mutation also supports scheduling gift card
 * notifications to recipients, with a personalized message, through the [`recipientAttributes`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/GiftCardCreateInput#fields-recipientAttributes)
 * field on the `GiftCardCreateInput` input object.
 */
public class GiftCardCreateGraphQLQuery extends GraphQLQuery {
  public GiftCardCreateGraphQLQuery(GiftCardCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public GiftCardCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "giftCardCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private GiftCardCreateInput input;

    private String queryName;

    public GiftCardCreateGraphQLQuery build() {
      return new GiftCardCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields to create a gift card.
     */
    public Builder input(GiftCardCreateInput input) {
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
