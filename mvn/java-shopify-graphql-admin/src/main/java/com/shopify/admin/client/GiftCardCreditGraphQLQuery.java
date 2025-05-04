package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.GiftCardCreditInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Credit a gift card.
 */
public class GiftCardCreditGraphQLQuery extends GraphQLQuery {
  public GiftCardCreditGraphQLQuery(String id, GiftCardCreditInput creditInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (creditInput != null || fieldsSet.contains("creditInput")) {
        getInput().put("creditInput", creditInput);
    }
  }

  public GiftCardCreditGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "giftCardCredit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private GiftCardCreditInput creditInput;

    private String queryName;

    public GiftCardCreditGraphQLQuery build() {
      return new GiftCardCreditGraphQLQuery(id, creditInput, queryName, fieldsSet);
               
    }

    /**
     * The ID of the gift card to be credited.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields to credit a gift card.
     */
    public Builder creditInput(GiftCardCreditInput creditInput) {
      this.creditInput = creditInput;
      this.fieldsSet.add("creditInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
