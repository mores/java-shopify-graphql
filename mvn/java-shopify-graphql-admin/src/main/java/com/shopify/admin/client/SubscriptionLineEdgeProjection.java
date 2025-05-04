package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionLineEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionLineEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionLineEdge"));
  }

  public SubscriptionLineEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionLineProjection<SubscriptionLineEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SubscriptionLineProjection<SubscriptionLineEdgeProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SubscriptionLineEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
