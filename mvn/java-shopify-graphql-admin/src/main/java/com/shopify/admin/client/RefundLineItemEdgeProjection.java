package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundLineItemEdge"));
  }

  public RefundLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundLineItemProjection<RefundLineItemEdgeProjection<PARENT, ROOT>, ROOT> node() {
     RefundLineItemProjection<RefundLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new RefundLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public RefundLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
