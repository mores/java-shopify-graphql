package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppSubscriptionEdge"));
  }

  public AppSubscriptionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionProjection<AppSubscriptionEdgeProjection<PARENT, ROOT>, ROOT> node() {
     AppSubscriptionProjection<AppSubscriptionEdgeProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AppSubscriptionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
