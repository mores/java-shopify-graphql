package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates the gift card codes applied to the cart.
 */
public class CartGiftCardCodesUpdateGraphQLQuery extends GraphQLQuery {
  public CartGiftCardCodesUpdateGraphQLQuery(String cartId, List<String> giftCardCodes,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (giftCardCodes != null || fieldsSet.contains("giftCardCodes")) {
        getInput().put("giftCardCodes", giftCardCodes);
    }
  }

  public CartGiftCardCodesUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartGiftCardCodesUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private List<String> giftCardCodes;

    private String queryName;

    public CartGiftCardCodesUpdateGraphQLQuery build() {
      return new CartGiftCardCodesUpdateGraphQLQuery(cartId, giftCardCodes, queryName, fieldsSet);
               
    }

    /**
     * The ID of the cart.
     */
    public Builder cartId(String cartId) {
      this.cartId = cartId;
      this.fieldsSet.add("cartId");
      return this;
    }

    /**
     * The case-insensitive gift card codes.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder giftCardCodes(List<String> giftCardCodes) {
      this.giftCardCodes = giftCardCodes;
      this.fieldsSet.add("giftCardCodes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
