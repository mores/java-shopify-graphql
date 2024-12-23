package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Segment"));
  }

  public SegmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentProjection<PARENT, ROOT> creationDate() {
    getFields().put("creationDate", null);
    return this;
  }

  public SegmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SegmentProjection<PARENT, ROOT> lastEditDate() {
    getFields().put("lastEditDate", null);
    return this;
  }

  public SegmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SegmentProjection<PARENT, ROOT> query() {
    getFields().put("query", null);
    return this;
  }
}
