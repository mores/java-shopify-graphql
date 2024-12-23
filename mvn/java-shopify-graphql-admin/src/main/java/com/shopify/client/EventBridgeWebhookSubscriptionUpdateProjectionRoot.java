package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EventBridgeWebhookSubscriptionUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("EventBridgeWebhookSubscriptionUpdatePayload"));
  }

  public EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebhookSubscriptionProjection<EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> webhookSubscription(
      ) {
    WebhookSubscriptionProjection<EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, EventBridgeWebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionProjection<>(this, this);    
    getFields().put("webhookSubscription", projection);
    return projection;
  }
}
