package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.GiftCardDebitInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Debit a gift card.
 */
public class GiftCardDebitGraphQLQuery extends GraphQLQuery {
  public GiftCardDebitGraphQLQuery(String id, GiftCardDebitInput debitInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (debitInput != null || fieldsSet.contains("debitInput")) {
        getInput().put("debitInput", debitInput);
    }
  }

  public GiftCardDebitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "giftCardDebit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private GiftCardDebitInput debitInput;

    private String queryName;

    public GiftCardDebitGraphQLQuery build() {
      return new GiftCardDebitGraphQLQuery(id, debitInput, queryName, fieldsSet);
               
    }

    /**
     * The ID of the gift card to be debited.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields to debit a gift card.
     */
    public Builder debitInput(GiftCardDebitInput debitInput) {
      this.debitInput = debitInput;
      this.fieldsSet.add("debitInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
