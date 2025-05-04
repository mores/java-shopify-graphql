package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebhookSubscriptionMetafieldIdentifierProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebhookSubscriptionMetafieldIdentifierProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookSubscriptionMetafieldIdentifier"));
  }

  public WebhookSubscriptionMetafieldIdentifierProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebhookSubscriptionMetafieldIdentifierProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public WebhookSubscriptionMetafieldIdentifierProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }
}
