package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentValueConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentValueConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentValueConnection"));
  }

  public SegmentValueConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentValueEdgeProjection<SegmentValueConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     SegmentValueEdgeProjection<SegmentValueConnectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentValueEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SegmentValueProjection<SegmentValueConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     SegmentValueProjection<SegmentValueConnectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentValueProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SegmentValueConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SegmentValueConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
