package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardUpdatePayload"));
  }

  public GiftCardUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardProjection<GiftCardUpdateProjectionRoot<PARENT, ROOT>, GiftCardUpdateProjectionRoot<PARENT, ROOT>> giftCard(
      ) {
    GiftCardProjection<GiftCardUpdateProjectionRoot<PARENT, ROOT>, GiftCardUpdateProjectionRoot<PARENT, ROOT>> projection = new GiftCardProjection<>(this, this);    
    getFields().put("giftCard", projection);
    return projection;
  }

  public UserErrorProjection<GiftCardUpdateProjectionRoot<PARENT, ROOT>, GiftCardUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<GiftCardUpdateProjectionRoot<PARENT, ROOT>, GiftCardUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
