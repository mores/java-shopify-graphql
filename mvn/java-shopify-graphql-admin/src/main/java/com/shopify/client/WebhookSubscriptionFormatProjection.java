package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionFormatProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionFormatProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookSubscriptionFormat"));
  }

  public WebhookSubscriptionFormatProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
