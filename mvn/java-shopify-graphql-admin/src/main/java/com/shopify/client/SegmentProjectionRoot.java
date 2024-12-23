package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentProjectionRoot() {
    super(null, null, java.util.Optional.of("Segment"));
  }

  public SegmentProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentProjectionRoot<PARENT, ROOT> creationDate() {
    getFields().put("creationDate", null);
    return this;
  }

  public SegmentProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SegmentProjectionRoot<PARENT, ROOT> lastEditDate() {
    getFields().put("lastEditDate", null);
    return this;
  }

  public SegmentProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SegmentProjectionRoot<PARENT, ROOT> query() {
    getFields().put("query", null);
    return this;
  }
}
