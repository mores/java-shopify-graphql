package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardRecipientProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardRecipientProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardRecipient"));
  }

  public GiftCardRecipientProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<GiftCardRecipientProjection<PARENT, ROOT>, ROOT> recipient() {
     CustomerProjection<GiftCardRecipientProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("recipient", projection);
     return projection;
  }

  public GiftCardRecipientProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public GiftCardRecipientProjection<PARENT, ROOT> preferredName() {
    getFields().put("preferredName", null);
    return this;
  }

  public GiftCardRecipientProjection<PARENT, ROOT> sendNotificationAt() {
    getFields().put("sendNotificationAt", null);
    return this;
  }
}
