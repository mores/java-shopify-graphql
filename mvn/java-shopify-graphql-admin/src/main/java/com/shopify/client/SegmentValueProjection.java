package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentValue"));
  }

  public SegmentValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentValueProjection<PARENT, ROOT> localizedValue() {
    getFields().put("localizedValue", null);
    return this;
  }

  public SegmentValueProjection<PARENT, ROOT> queryName() {
    getFields().put("queryName", null);
    return this;
  }
}
