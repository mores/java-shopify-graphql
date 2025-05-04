package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundShippingLineEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundShippingLineEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundShippingLineEdge"));
  }

  public RefundShippingLineEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundShippingLineProjection<RefundShippingLineEdgeProjection<PARENT, ROOT>, ROOT> node() {
     RefundShippingLineProjection<RefundShippingLineEdgeProjection<PARENT, ROOT>, ROOT> projection = new RefundShippingLineProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public RefundShippingLineEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
