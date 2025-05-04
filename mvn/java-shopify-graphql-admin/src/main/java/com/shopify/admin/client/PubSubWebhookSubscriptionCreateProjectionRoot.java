package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PubSubWebhookSubscriptionCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PubSubWebhookSubscriptionCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("PubSubWebhookSubscriptionCreatePayload"));
  }

  public PubSubWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PubSubWebhookSubscriptionCreateUserErrorProjection<PubSubWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, PubSubWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PubSubWebhookSubscriptionCreateUserErrorProjection<PubSubWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, PubSubWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> projection = new PubSubWebhookSubscriptionCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebhookSubscriptionProjection<PubSubWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, PubSubWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> webhookSubscription(
      ) {
    WebhookSubscriptionProjection<PubSubWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, PubSubWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionProjection<>(this, this);    
    getFields().put("webhookSubscription", projection);
    return projection;
  }
}
