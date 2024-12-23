package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardSendNotificationToRecipientProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardSendNotificationToRecipientProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardSendNotificationToRecipientPayload"));
  }

  public GiftCardSendNotificationToRecipientProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardProjection<GiftCardSendNotificationToRecipientProjectionRoot<PARENT, ROOT>, GiftCardSendNotificationToRecipientProjectionRoot<PARENT, ROOT>> giftCard(
      ) {
    GiftCardProjection<GiftCardSendNotificationToRecipientProjectionRoot<PARENT, ROOT>, GiftCardSendNotificationToRecipientProjectionRoot<PARENT, ROOT>> projection = new GiftCardProjection<>(this, this);    
    getFields().put("giftCard", projection);
    return projection;
  }

  public GiftCardSendNotificationToRecipientUserErrorProjection<GiftCardSendNotificationToRecipientProjectionRoot<PARENT, ROOT>, GiftCardSendNotificationToRecipientProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    GiftCardSendNotificationToRecipientUserErrorProjection<GiftCardSendNotificationToRecipientProjectionRoot<PARENT, ROOT>, GiftCardSendNotificationToRecipientProjectionRoot<PARENT, ROOT>> projection = new GiftCardSendNotificationToRecipientUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
