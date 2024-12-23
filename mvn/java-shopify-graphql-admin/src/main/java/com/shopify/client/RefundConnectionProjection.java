package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundConnection"));
  }

  public RefundConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundEdgeProjection<RefundConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     RefundEdgeProjection<RefundConnectionProjection<PARENT, ROOT>, ROOT> projection = new RefundEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public RefundProjection<RefundConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     RefundProjection<RefundConnectionProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<RefundConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<RefundConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
