package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundLineItemConnection"));
  }

  public RefundLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundLineItemEdgeProjection<RefundLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     RefundLineItemEdgeProjection<RefundLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new RefundLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public RefundLineItemProjection<RefundLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     RefundLineItemProjection<RefundLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new RefundLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<RefundLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<RefundLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
