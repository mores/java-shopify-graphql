package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentFilterEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentFilterEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentFilterEdge"));
  }

  public SegmentFilterEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentFilterProjection<SegmentFilterEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SegmentFilterProjection<SegmentFilterEdgeProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SegmentFilterEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
