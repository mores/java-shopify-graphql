package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionTopicProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionTopicProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookSubscriptionTopic"));
  }

  public WebhookSubscriptionTopicProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
