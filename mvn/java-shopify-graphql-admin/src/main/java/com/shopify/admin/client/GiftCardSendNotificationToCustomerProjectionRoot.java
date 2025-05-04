package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardSendNotificationToCustomerProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardSendNotificationToCustomerProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardSendNotificationToCustomerPayload"));
  }

  public GiftCardSendNotificationToCustomerProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardProjection<GiftCardSendNotificationToCustomerProjectionRoot<PARENT, ROOT>, GiftCardSendNotificationToCustomerProjectionRoot<PARENT, ROOT>> giftCard(
      ) {
    GiftCardProjection<GiftCardSendNotificationToCustomerProjectionRoot<PARENT, ROOT>, GiftCardSendNotificationToCustomerProjectionRoot<PARENT, ROOT>> projection = new GiftCardProjection<>(this, this);    
    getFields().put("giftCard", projection);
    return projection;
  }

  public GiftCardSendNotificationToCustomerUserErrorProjection<GiftCardSendNotificationToCustomerProjectionRoot<PARENT, ROOT>, GiftCardSendNotificationToCustomerProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    GiftCardSendNotificationToCustomerUserErrorProjection<GiftCardSendNotificationToCustomerProjectionRoot<PARENT, ROOT>, GiftCardSendNotificationToCustomerProjectionRoot<PARENT, ROOT>> projection = new GiftCardSendNotificationToCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
