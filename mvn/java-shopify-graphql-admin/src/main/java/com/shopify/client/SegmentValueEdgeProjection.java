package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentValueEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentValueEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentValueEdge"));
  }

  public SegmentValueEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentValueProjection<SegmentValueEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SegmentValueProjection<SegmentValueEdgeProjection<PARENT, ROOT>, ROOT> projection = new SegmentValueProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SegmentValueEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
