package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardCreditProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardCreditProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardCreditPayload"));
  }

  public GiftCardCreditProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardCreditTransactionProjection<GiftCardCreditProjectionRoot<PARENT, ROOT>, GiftCardCreditProjectionRoot<PARENT, ROOT>> giftCardCreditTransaction(
      ) {
    GiftCardCreditTransactionProjection<GiftCardCreditProjectionRoot<PARENT, ROOT>, GiftCardCreditProjectionRoot<PARENT, ROOT>> projection = new GiftCardCreditTransactionProjection<>(this, this);    
    getFields().put("giftCardCreditTransaction", projection);
    return projection;
  }

  public GiftCardTransactionUserErrorProjection<GiftCardCreditProjectionRoot<PARENT, ROOT>, GiftCardCreditProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    GiftCardTransactionUserErrorProjection<GiftCardCreditProjectionRoot<PARENT, ROOT>, GiftCardCreditProjectionRoot<PARENT, ROOT>> projection = new GiftCardTransactionUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
