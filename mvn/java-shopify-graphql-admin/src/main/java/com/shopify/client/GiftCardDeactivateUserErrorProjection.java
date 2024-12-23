package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardDeactivateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardDeactivateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardDeactivateUserError"));
  }

  public GiftCardDeactivateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardDeactivateUserErrorCodeProjection<GiftCardDeactivateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     GiftCardDeactivateUserErrorCodeProjection<GiftCardDeactivateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new GiftCardDeactivateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public GiftCardDeactivateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public GiftCardDeactivateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
