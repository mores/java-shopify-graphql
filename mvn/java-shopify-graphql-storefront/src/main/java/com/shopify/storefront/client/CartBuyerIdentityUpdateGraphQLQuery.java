package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartBuyerIdentityInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates customer information associated with a cart.
 * Buyer identity is used to determine
 * [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing)
 * and should match the customer's shipping address.
 */
public class CartBuyerIdentityUpdateGraphQLQuery extends GraphQLQuery {
  public CartBuyerIdentityUpdateGraphQLQuery(String cartId, CartBuyerIdentityInput buyerIdentity,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (buyerIdentity != null || fieldsSet.contains("buyerIdentity")) {
        getInput().put("buyerIdentity", buyerIdentity);
    }
  }

  public CartBuyerIdentityUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartBuyerIdentityUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private CartBuyerIdentityInput buyerIdentity;

    private String queryName;

    public CartBuyerIdentityUpdateGraphQLQuery build() {
      return new CartBuyerIdentityUpdateGraphQLQuery(cartId, buyerIdentity, queryName, fieldsSet);
               
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
     * The customer associated with the cart. Used to determine
     * [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
     * Buyer identity should match the customer's shipping address.
     */
    public Builder buyerIdentity(CartBuyerIdentityInput buyerIdentity) {
      this.buyerIdentity = buyerIdentity;
      this.fieldsSet.add("buyerIdentity");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
