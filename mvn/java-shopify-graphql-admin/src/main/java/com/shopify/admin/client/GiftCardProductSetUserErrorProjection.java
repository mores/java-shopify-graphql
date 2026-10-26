package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardProductSetUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardProductSetUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardProductSetUserError"));
  }

  public GiftCardProductSetUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardProductSetUserErrorCodeProjection<GiftCardProductSetUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     GiftCardProductSetUserErrorCodeProjection<GiftCardProductSetUserErrorProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProductSetUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public GiftCardProductSetUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public GiftCardProductSetUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
