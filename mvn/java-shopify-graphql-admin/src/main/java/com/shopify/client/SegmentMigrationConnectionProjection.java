package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentMigrationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentMigrationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentMigrationConnection"));
  }

  public SegmentMigrationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentMigrationEdgeProjection<SegmentMigrationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SegmentMigrationEdgeProjection<SegmentMigrationConnectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentMigrationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SegmentMigrationProjection<SegmentMigrationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SegmentMigrationProjection<SegmentMigrationConnectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentMigrationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SegmentMigrationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SegmentMigrationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
