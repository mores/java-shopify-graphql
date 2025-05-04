package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardSendNotificationToRecipientUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardSendNotificationToRecipientUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardSendNotificationToRecipientUserError"));
  }

  public GiftCardSendNotificationToRecipientUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardSendNotificationToRecipientUserErrorCodeProjection<GiftCardSendNotificationToRecipientUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     GiftCardSendNotificationToRecipientUserErrorCodeProjection<GiftCardSendNotificationToRecipientUserErrorProjection<PARENT, ROOT>, ROOT> projection = new GiftCardSendNotificationToRecipientUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public GiftCardSendNotificationToRecipientUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public GiftCardSendNotificationToRecipientUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
