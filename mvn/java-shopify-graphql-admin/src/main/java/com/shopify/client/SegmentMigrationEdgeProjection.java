package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentMigrationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentMigrationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentMigrationEdge"));
  }

  public SegmentMigrationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentMigrationProjection<SegmentMigrationEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SegmentMigrationProjection<SegmentMigrationEdgeProjection<PARENT, ROOT>, ROOT> projection = new SegmentMigrationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SegmentMigrationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
