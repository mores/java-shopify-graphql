package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookSubscriptionEdge"));
  }

  public WebhookSubscriptionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebhookSubscriptionProjection<WebhookSubscriptionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     WebhookSubscriptionProjection<WebhookSubscriptionEdgeProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public WebhookSubscriptionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
