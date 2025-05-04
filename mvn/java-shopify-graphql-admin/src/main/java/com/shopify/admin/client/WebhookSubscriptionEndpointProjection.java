package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionEndpointProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionEndpointProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookSubscriptionEndpoint"));
  }

  public WebhookSubscriptionEndpointProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebhookEventBridgeEndpointFragmentProjection<WebhookSubscriptionEndpointProjection<PARENT, ROOT>, ROOT> onWebhookEventBridgeEndpoint(
      ) {
    WebhookEventBridgeEndpointFragmentProjection<WebhookSubscriptionEndpointProjection<PARENT, ROOT>, ROOT> fragment = new WebhookEventBridgeEndpointFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public WebhookHttpEndpointFragmentProjection<WebhookSubscriptionEndpointProjection<PARENT, ROOT>, ROOT> onWebhookHttpEndpoint(
      ) {
    WebhookHttpEndpointFragmentProjection<WebhookSubscriptionEndpointProjection<PARENT, ROOT>, ROOT> fragment = new WebhookHttpEndpointFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public WebhookPubSubEndpointFragmentProjection<WebhookSubscriptionEndpointProjection<PARENT, ROOT>, ROOT> onWebhookPubSubEndpoint(
      ) {
    WebhookPubSubEndpointFragmentProjection<WebhookSubscriptionEndpointProjection<PARENT, ROOT>, ROOT> fragment = new WebhookPubSubEndpointFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
