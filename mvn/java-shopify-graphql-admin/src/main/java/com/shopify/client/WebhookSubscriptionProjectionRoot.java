package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionProjectionRoot() {
    super(null, null, java.util.Optional.of("WebhookSubscription"));
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ApiVersionProjection<WebhookSubscriptionProjectionRoot<PARENT, ROOT>, WebhookSubscriptionProjectionRoot<PARENT, ROOT>> apiVersion(
      ) {
    ApiVersionProjection<WebhookSubscriptionProjectionRoot<PARENT, ROOT>, WebhookSubscriptionProjectionRoot<PARENT, ROOT>> projection = new ApiVersionProjection<>(this, this);    
    getFields().put("apiVersion", projection);
    return projection;
  }

  public WebhookSubscriptionEndpointProjection<WebhookSubscriptionProjectionRoot<PARENT, ROOT>, WebhookSubscriptionProjectionRoot<PARENT, ROOT>> endpoint(
      ) {
    WebhookSubscriptionEndpointProjection<WebhookSubscriptionProjectionRoot<PARENT, ROOT>, WebhookSubscriptionProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionEndpointProjection<>(this, this);    
    getFields().put("endpoint", projection);
    return projection;
  }

  public WebhookSubscriptionFormatProjection<WebhookSubscriptionProjectionRoot<PARENT, ROOT>, WebhookSubscriptionProjectionRoot<PARENT, ROOT>> format(
      ) {
    WebhookSubscriptionFormatProjection<WebhookSubscriptionProjectionRoot<PARENT, ROOT>, WebhookSubscriptionProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionFormatProjection<>(this, this);    
    getFields().put("format", projection);
    return projection;
  }

  public WebhookSubscriptionTopicProjection<WebhookSubscriptionProjectionRoot<PARENT, ROOT>, WebhookSubscriptionProjectionRoot<PARENT, ROOT>> topic(
      ) {
    WebhookSubscriptionTopicProjection<WebhookSubscriptionProjectionRoot<PARENT, ROOT>, WebhookSubscriptionProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionTopicProjection<>(this, this);    
    getFields().put("topic", projection);
    return projection;
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> callbackUrl() {
    getFields().put("callbackUrl", null);
    return this;
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> filter() {
    getFields().put("filter", null);
    return this;
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> includeFields() {
    getFields().put("includeFields", null);
    return this;
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> metafieldNamespaces() {
    getFields().put("metafieldNamespaces", null);
    return this;
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> privateMetafieldNamespaces() {
    getFields().put("privateMetafieldNamespaces", null);
    return this;
  }

  public WebhookSubscriptionProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
