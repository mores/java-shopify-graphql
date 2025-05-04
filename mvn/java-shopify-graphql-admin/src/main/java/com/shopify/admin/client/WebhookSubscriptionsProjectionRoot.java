package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionsProjectionRoot() {
    super(null, null, java.util.Optional.of("WebhookSubscriptionConnection"));
  }

  public WebhookSubscriptionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebhookSubscriptionEdgeProjection<WebhookSubscriptionsProjectionRoot<PARENT, ROOT>, WebhookSubscriptionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    WebhookSubscriptionEdgeProjection<WebhookSubscriptionsProjectionRoot<PARENT, ROOT>, WebhookSubscriptionsProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public WebhookSubscriptionProjection<WebhookSubscriptionsProjectionRoot<PARENT, ROOT>, WebhookSubscriptionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    WebhookSubscriptionProjection<WebhookSubscriptionsProjectionRoot<PARENT, ROOT>, WebhookSubscriptionsProjectionRoot<PARENT, ROOT>> projection = new WebhookSubscriptionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<WebhookSubscriptionsProjectionRoot<PARENT, ROOT>, WebhookSubscriptionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<WebhookSubscriptionsProjectionRoot<PARENT, ROOT>, WebhookSubscriptionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
