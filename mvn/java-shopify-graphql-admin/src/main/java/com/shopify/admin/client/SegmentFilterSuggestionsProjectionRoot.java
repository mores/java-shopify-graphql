package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentFilterSuggestionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentFilterSuggestionsProjectionRoot() {
    super(null, null, java.util.Optional.of("SegmentFilterConnection"));
  }

  public SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentFilterEdgeProjection<SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>, SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SegmentFilterEdgeProjection<SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>, SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>> projection = new SegmentFilterEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SegmentFilterProjection<SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>, SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SegmentFilterProjection<SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>, SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>> projection = new SegmentFilterProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>, SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>, SegmentFilterSuggestionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
