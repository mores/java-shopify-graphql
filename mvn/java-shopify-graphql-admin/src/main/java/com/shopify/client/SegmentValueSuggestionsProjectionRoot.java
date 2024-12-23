package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentValueSuggestionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentValueSuggestionsProjectionRoot() {
    super(null, null, java.util.Optional.of("SegmentValueConnection"));
  }

  public SegmentValueSuggestionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentValueEdgeProjection<SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>, SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SegmentValueEdgeProjection<SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>, SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>> projection = new SegmentValueEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SegmentValueProjection<SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>, SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SegmentValueProjection<SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>, SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>> projection = new SegmentValueProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>, SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>, SegmentValueSuggestionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
