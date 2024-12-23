package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.GiftCardCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a gift card.
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
