package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("WebhookSubscriptionCreatePayload"));
  }

  public WebhookSubscriptionCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<WebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, WebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<WebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, WebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebhookSubscriptionProjection<WebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, WebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> webhookSubscription(
      ) {
    WebhookSubscriptionProjection<WebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>, WebhookSubscriptionCreateProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionProjection<>(this, this);    
    getFields().put("webhookSubscription", projection);
    return projection;
  }
}
