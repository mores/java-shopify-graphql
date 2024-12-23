package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundEdge"));
  }

  public RefundEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundProjection<RefundEdgeProjection<PARENT, ROOT>, ROOT> node() {
     RefundProjection<RefundEdgeProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public RefundEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
