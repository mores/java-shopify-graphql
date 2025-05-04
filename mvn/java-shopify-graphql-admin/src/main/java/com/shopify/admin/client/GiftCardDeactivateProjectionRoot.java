package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardDeactivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardDeactivateProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardDeactivatePayload"));
  }

  public GiftCardDeactivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardProjection<GiftCardDeactivateProjectionRoot<PARENT, ROOT>, GiftCardDeactivateProjectionRoot<PARENT, ROOT>> giftCard(
      ) {
    GiftCardProjection<GiftCardDeactivateProjectionRoot<PARENT, ROOT>, GiftCardDeactivateProjectionRoot<PARENT, ROOT>> projection = new GiftCardProjection<>(this, this);    
    getFields().put("giftCard", projection);
    return projection;
  }

  public GiftCardDeactivateUserErrorProjection<GiftCardDeactivateProjectionRoot<PARENT, ROOT>, GiftCardDeactivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    GiftCardDeactivateUserErrorProjection<GiftCardDeactivateProjectionRoot<PARENT, ROOT>, GiftCardDeactivateProjectionRoot<PARENT, ROOT>> projection = new GiftCardDeactivateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
