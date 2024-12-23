package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EventBridgeWebhookSubscriptionCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("EventBridgeWebhookSubscriptionCreatePayload"));
  }

  public EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebhookSubscriptionProjection<EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> webhookSubscription(
      ) {
    WebhookSubscriptionProjection<EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, EventBridgeWebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionProjection<>(this, this);    
    getFields().put("webhookSubscription", projection);
    return projection;
  }
}
