package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardUserError"));
  }

  public GiftCardUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardErrorCodeProjection<GiftCardUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     GiftCardErrorCodeProjection<GiftCardUserErrorProjection<PARENT, ROOT>, ROOT> projection = new GiftCardErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public GiftCardUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public GiftCardUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
