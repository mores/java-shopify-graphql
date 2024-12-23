package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentFiltersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentFiltersProjectionRoot() {
    super(null, null, java.util.Optional.of("SegmentFilterConnection"));
  }

  public SegmentFiltersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentFilterEdgeProjection<SegmentFiltersProjectionRoot<PARENT, ROOT>, SegmentFiltersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SegmentFilterEdgeProjection<SegmentFiltersProjectionRoot<PARENT, ROOT>, SegmentFiltersProjectionRoot<PARENT, ROOT>> projection = new SegmentFilterEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SegmentFilterProjection<SegmentFiltersProjectionRoot<PARENT, ROOT>, SegmentFiltersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SegmentFilterProjection<SegmentFiltersProjectionRoot<PARENT, ROOT>, SegmentFiltersProjectionRoot<PARENT, ROOT>> projection = new SegmentFilterProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SegmentFiltersProjectionRoot<PARENT, ROOT>, SegmentFiltersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SegmentFiltersProjectionRoot<PARENT, ROOT>, SegmentFiltersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
