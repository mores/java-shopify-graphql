package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardSendNotificationToCustomerUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardSendNotificationToCustomerUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardSendNotificationToCustomerUserError"));
  }

  public GiftCardSendNotificationToCustomerUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardSendNotificationToCustomerUserErrorCodeProjection<GiftCardSendNotificationToCustomerUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     GiftCardSendNotificationToCustomerUserErrorCodeProjection<GiftCardSendNotificationToCustomerUserErrorProjection<PARENT, ROOT>, ROOT> projection = new GiftCardSendNotificationToCustomerUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public GiftCardSendNotificationToCustomerUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public GiftCardSendNotificationToCustomerUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
