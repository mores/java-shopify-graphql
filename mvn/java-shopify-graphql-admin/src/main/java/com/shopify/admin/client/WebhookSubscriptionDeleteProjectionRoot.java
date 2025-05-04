package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("WebhookSubscriptionDeletePayload"));
  }

  public WebhookSubscriptionDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<WebhookSubscriptionDeleteProjectionRoot<PARENT, ROOT>, WebhookSubscriptionDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<WebhookSubscriptionDeleteProjectionRoot<PARENT, ROOT>, WebhookSubscriptionDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public WebhookSubscriptionDeleteProjectionRoot<PARENT, ROOT> deletedWebhookSubscriptionId() {
    getFields().put("deletedWebhookSubscriptionId", null);
    return this;
  }
}
