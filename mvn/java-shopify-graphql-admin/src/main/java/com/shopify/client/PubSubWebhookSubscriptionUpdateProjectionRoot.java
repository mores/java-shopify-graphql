package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PubSubWebhookSubscriptionUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PubSubWebhookSubscriptionUpdatePayload"));
  }

  public PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PubSubWebhookSubscriptionUpdateUserErrorProjection<PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PubSubWebhookSubscriptionUpdateUserErrorProjection<PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> projection = new PubSubWebhookSubscriptionUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebhookSubscriptionProjection<PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> webhookSubscription(
      ) {
    WebhookSubscriptionProjection<PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, PubSubWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionProjection<>(this, this);    
    getFields().put("webhookSubscription", projection);
    return projection;
  }
}
