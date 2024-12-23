package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentsProjectionRoot() {
    super(null, null, java.util.Optional.of("SegmentConnection"));
  }

  public SegmentsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentEdgeProjection<SegmentsProjectionRoot<PARENT, ROOT>, SegmentsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SegmentEdgeProjection<SegmentsProjectionRoot<PARENT, ROOT>, SegmentsProjectionRoot<PARENT, ROOT>> projection = new SegmentEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SegmentProjection<SegmentsProjectionRoot<PARENT, ROOT>, SegmentsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SegmentProjection<SegmentsProjectionRoot<PARENT, ROOT>, SegmentsProjectionRoot<PARENT, ROOT>> projection = new SegmentProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SegmentsProjectionRoot<PARENT, ROOT>, SegmentsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SegmentsProjectionRoot<PARENT, ROOT>, SegmentsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
