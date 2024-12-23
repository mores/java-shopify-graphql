package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("WebhookSubscriptionUpdatePayload"));
  }

  public WebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<WebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, WebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<WebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, WebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebhookSubscriptionProjection<WebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, WebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> webhookSubscription(
      ) {
    WebhookSubscriptionProjection<WebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>, WebhookSubscriptionUpdateProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionProjection<>(this, this);    
    getFields().put("webhookSubscription", projection);
    return projection;
  }
}
