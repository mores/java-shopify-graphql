package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class WebhookSubscriptionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public WebhookSubscriptionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookSubscription"));
  }

  public WebhookSubscriptionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ApiVersionProjection<WebhookSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> apiVersion(
      ) {
     ApiVersionProjection<WebhookSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ApiVersionProjection<>(this, getRoot());
     getFields().put("apiVersion", projection);
     return projection;
  }

  public WebhookSubscriptionEndpointProjection<WebhookSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> endpoint(
      ) {
     WebhookSubscriptionEndpointProjection<WebhookSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionEndpointProjection<>(this, getRoot());
     getFields().put("endpoint", projection);
     return projection;
  }

  public WebhookSubscriptionFormatProjection<WebhookSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> format(
      ) {
     WebhookSubscriptionFormatProjection<WebhookSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionFormatProjection<>(this, getRoot());
     getFields().put("format", projection);
     return projection;
  }

  public WebhookSubscriptionTopicProjection<WebhookSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> topic(
      ) {
     WebhookSubscriptionTopicProjection<WebhookSubscriptionFragmentProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionTopicProjection<>(this, getRoot());
     getFields().put("topic", projection);
     return projection;
  }

  public WebhookSubscriptionFragmentProjection<PARENT, ROOT> callbackUrl() {
    getFields().put("callbackUrl", null);
    return this;
  }

  public WebhookSubscriptionFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public WebhookSubscriptionFragmentProjection<PARENT, ROOT> filter() {
    getFields().put("filter", null);
    return this;
  }

  public WebhookSubscriptionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public WebhookSubscriptionFragmentProjection<PARENT, ROOT> includeFields() {
    getFields().put("includeFields", null);
    return this;
  }

  public WebhookSubscriptionFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public WebhookSubscriptionFragmentProjection<PARENT, ROOT> metafieldNamespaces() {
    getFields().put("metafieldNamespaces", null);
    return this;
  }

  public WebhookSubscriptionFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on WebhookSubscription {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
