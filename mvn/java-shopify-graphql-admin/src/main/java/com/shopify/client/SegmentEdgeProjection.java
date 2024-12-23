package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentEdge"));
  }

  public SegmentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentProjection<SegmentEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SegmentProjection<SegmentEdgeProjection<PARENT, ROOT>, ROOT> projection = new SegmentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SegmentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
