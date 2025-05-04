package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentMigrationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentMigrationsProjectionRoot() {
    super(null, null, java.util.Optional.of("SegmentMigrationConnection"));
  }

  public SegmentMigrationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentMigrationEdgeProjection<SegmentMigrationsProjectionRoot<PARENT, ROOT>, SegmentMigrationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SegmentMigrationEdgeProjection<SegmentMigrationsProjectionRoot<PARENT, ROOT>, SegmentMigrationsProjectionRoot<PARENT, ROOT>> projection = new SegmentMigrationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SegmentMigrationProjection<SegmentMigrationsProjectionRoot<PARENT, ROOT>, SegmentMigrationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SegmentMigrationProjection<SegmentMigrationsProjectionRoot<PARENT, ROOT>, SegmentMigrationsProjectionRoot<PARENT, ROOT>> projection = new SegmentMigrationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SegmentMigrationsProjectionRoot<PARENT, ROOT>, SegmentMigrationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SegmentMigrationsProjectionRoot<PARENT, ROOT>, SegmentMigrationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
