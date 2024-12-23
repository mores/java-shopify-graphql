package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookSubscriptionConnection"));
  }

  public WebhookSubscriptionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebhookSubscriptionEdgeProjection<WebhookSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     WebhookSubscriptionEdgeProjection<WebhookSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public WebhookSubscriptionProjection<WebhookSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     WebhookSubscriptionProjection<WebhookSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<WebhookSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<WebhookSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
