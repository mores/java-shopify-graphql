package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentFilterConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentFilterConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentFilterConnection"));
  }

  public SegmentFilterConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentFilterEdgeProjection<SegmentFilterConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SegmentFilterEdgeProjection<SegmentFilterConnectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SegmentFilterProjection<SegmentFilterConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     SegmentFilterProjection<SegmentFilterConnectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SegmentFilterConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SegmentFilterConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
