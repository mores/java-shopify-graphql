package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardDebitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardDebitProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardDebitPayload"));
  }

  public GiftCardDebitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardDebitTransactionProjection<GiftCardDebitProjectionRoot<PARENT, ROOT>, GiftCardDebitProjectionRoot<PARENT, ROOT>> giftCardDebitTransaction(
      ) {
    GiftCardDebitTransactionProjection<GiftCardDebitProjectionRoot<PARENT, ROOT>, GiftCardDebitProjectionRoot<PARENT, ROOT>> projection = new GiftCardDebitTransactionProjection<>(this, this);    
    getFields().put("giftCardDebitTransaction", projection);
    return projection;
  }

  public GiftCardTransactionUserErrorProjection<GiftCardDebitProjectionRoot<PARENT, ROOT>, GiftCardDebitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    GiftCardTransactionUserErrorProjection<GiftCardDebitProjectionRoot<PARENT, ROOT>, GiftCardDebitProjectionRoot<PARENT, ROOT>> projection = new GiftCardTransactionUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
