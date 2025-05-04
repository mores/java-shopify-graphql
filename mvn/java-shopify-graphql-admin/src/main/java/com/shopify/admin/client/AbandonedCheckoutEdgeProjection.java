package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonedCheckoutEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckoutEdge"));
  }

  public AbandonedCheckoutEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutProjection<AbandonedCheckoutEdgeProjection<PARENT, ROOT>, ROOT> node() {
     AbandonedCheckoutProjection<AbandonedCheckoutEdgeProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AbandonedCheckoutEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
