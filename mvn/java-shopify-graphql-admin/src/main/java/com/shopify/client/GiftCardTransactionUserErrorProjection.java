package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardTransactionUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardTransactionUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardTransactionUserError"));
  }

  public GiftCardTransactionUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardTransactionUserErrorCodeProjection<GiftCardTransactionUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     GiftCardTransactionUserErrorCodeProjection<GiftCardTransactionUserErrorProjection<PARENT, ROOT>, ROOT> projection = new GiftCardTransactionUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public GiftCardTransactionUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public GiftCardTransactionUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
