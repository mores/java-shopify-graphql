package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardCreatePayload"));
  }

  public GiftCardCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardProjection<GiftCardCreateProjectionRoot<PARENT, ROOT>, GiftCardCreateProjectionRoot<PARENT, ROOT>> giftCard(
      ) {
    GiftCardProjection<GiftCardCreateProjectionRoot<PARENT, ROOT>, GiftCardCreateProjectionRoot<PARENT, ROOT>> projection = new GiftCardProjection<>(this, this);    
    getFields().put("giftCard", projection);
    return projection;
  }

  public GiftCardUserErrorProjection<GiftCardCreateProjectionRoot<PARENT, ROOT>, GiftCardCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    GiftCardUserErrorProjection<GiftCardCreateProjectionRoot<PARENT, ROOT>, GiftCardCreateProjectionRoot<PARENT, ROOT>> projection = new GiftCardUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public GiftCardCreateProjectionRoot<PARENT, ROOT> giftCardCode() {
    getFields().put("giftCardCode", null);
    return this;
  }
}
