package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookSubscription"));
  }

  public WebhookSubscriptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ApiVersionProjection<WebhookSubscriptionProjection<PARENT, ROOT>, ROOT> apiVersion() {
     ApiVersionProjection<WebhookSubscriptionProjection<PARENT, ROOT>, ROOT> projection = new ApiVersionProjection<>(this, getRoot());
     getFields().put("apiVersion", projection);
     return projection;
  }

  public WebhookSubscriptionEndpointProjection<WebhookSubscriptionProjection<PARENT, ROOT>, ROOT> endpoint(
      ) {
     WebhookSubscriptionEndpointProjection<WebhookSubscriptionProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionEndpointProjection<>(this, getRoot());
     getFields().put("endpoint", projection);
     return projection;
  }

  public WebhookSubscriptionFormatProjection<WebhookSubscriptionProjection<PARENT, ROOT>, ROOT> format(
      ) {
     WebhookSubscriptionFormatProjection<WebhookSubscriptionProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionFormatProjection<>(this, getRoot());
     getFields().put("format", projection);
     return projection;
  }

  public WebhookSubscriptionTopicProjection<WebhookSubscriptionProjection<PARENT, ROOT>, ROOT> topic(
      ) {
     WebhookSubscriptionTopicProjection<WebhookSubscriptionProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionTopicProjection<>(this, getRoot());
     getFields().put("topic", projection);
     return projection;
  }

  public WebhookSubscriptionProjection<PARENT, ROOT> callbackUrl() {
    getFields().put("callbackUrl", null);
    return this;
  }

  public WebhookSubscriptionProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public WebhookSubscriptionProjection<PARENT, ROOT> filter() {
    getFields().put("filter", null);
    return this;
  }

  public WebhookSubscriptionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public WebhookSubscriptionProjection<PARENT, ROOT> includeFields() {
    getFields().put("includeFields", null);
    return this;
  }

  public WebhookSubscriptionProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public WebhookSubscriptionProjection<PARENT, ROOT> metafieldNamespaces() {
    getFields().put("metafieldNamespaces", null);
    return this;
  }

  public WebhookSubscriptionProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
