package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.GiftCardUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update a gift card.
 */
public class GiftCardUpdateGraphQLQuery extends GraphQLQuery {
  public GiftCardUpdateGraphQLQuery(String id, GiftCardUpdateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public GiftCardUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "giftCardUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private GiftCardUpdateInput input;

    private String queryName;

    public GiftCardUpdateGraphQLQuery build() {
      return new GiftCardUpdateGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the gift card to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields to update the gift card.
     */
    public Builder input(GiftCardUpdateInput input) {
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
