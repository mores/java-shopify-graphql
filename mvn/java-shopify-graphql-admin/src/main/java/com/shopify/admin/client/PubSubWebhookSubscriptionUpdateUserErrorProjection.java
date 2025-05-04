package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PubSubWebhookSubscriptionUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PubSubWebhookSubscriptionUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PubSubWebhookSubscriptionUpdateUserError"));
  }

  public PubSubWebhookSubscriptionUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PubSubWebhookSubscriptionUpdateUserErrorCodeProjection<PubSubWebhookSubscriptionUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PubSubWebhookSubscriptionUpdateUserErrorCodeProjection<PubSubWebhookSubscriptionUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PubSubWebhookSubscriptionUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PubSubWebhookSubscriptionUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PubSubWebhookSubscriptionUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
