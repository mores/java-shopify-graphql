package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentMigrationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentMigrationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentMigration"));
  }

  public SegmentMigrationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentMigrationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SegmentMigrationProjection<PARENT, ROOT> savedSearchId() {
    getFields().put("savedSearchId", null);
    return this;
  }

  public SegmentMigrationProjection<PARENT, ROOT> segmentId() {
    getFields().put("segmentId", null);
    return this;
  }
}
