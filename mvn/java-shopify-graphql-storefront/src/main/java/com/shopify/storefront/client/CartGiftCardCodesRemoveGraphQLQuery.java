package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Removes the gift card codes applied to the cart.
 */
public class CartGiftCardCodesRemoveGraphQLQuery extends GraphQLQuery {
  public CartGiftCardCodesRemoveGraphQLQuery(List<String> appliedGiftCardIds, String cartId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (appliedGiftCardIds != null || fieldsSet.contains("appliedGiftCardIds")) {
        getInput().put("appliedGiftCardIds", appliedGiftCardIds);
    }if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }
  }

  public CartGiftCardCodesRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartGiftCardCodesRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> appliedGiftCardIds;

    private String cartId;

    private String queryName;

    public CartGiftCardCodesRemoveGraphQLQuery build() {
      return new CartGiftCardCodesRemoveGraphQLQuery(appliedGiftCardIds, cartId, queryName, fieldsSet);
               
    }

    /**
     * The gift cards to remove.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder appliedGiftCardIds(List<String> appliedGiftCardIds) {
      this.appliedGiftCardIds = appliedGiftCardIds;
      this.fieldsSet.add("appliedGiftCardIds");
      return this;
    }

    /**
     * The ID of the cart.
     */
    public Builder cartId(String cartId) {
      this.cartId = cartId;
      this.fieldsSet.add("cartId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
