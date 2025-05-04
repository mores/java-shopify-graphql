package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PubSubWebhookSubscriptionCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PubSubWebhookSubscriptionCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PubSubWebhookSubscriptionCreateUserError"));
  }

  public PubSubWebhookSubscriptionCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PubSubWebhookSubscriptionCreateUserErrorCodeProjection<PubSubWebhookSubscriptionCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PubSubWebhookSubscriptionCreateUserErrorCodeProjection<PubSubWebhookSubscriptionCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PubSubWebhookSubscriptionCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PubSubWebhookSubscriptionCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PubSubWebhookSubscriptionCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
