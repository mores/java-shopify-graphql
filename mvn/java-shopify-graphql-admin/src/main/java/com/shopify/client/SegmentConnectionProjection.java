package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentConnection"));
  }

  public SegmentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentEdgeProjection<SegmentConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     SegmentEdgeProjection<SegmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SegmentProjection<SegmentConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     SegmentProjection<SegmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SegmentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SegmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
