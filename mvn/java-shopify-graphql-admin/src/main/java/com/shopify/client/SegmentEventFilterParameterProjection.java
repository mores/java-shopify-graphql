package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentEventFilterParameterProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentEventFilterParameterProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentEventFilterParameter"));
  }

  public SegmentEventFilterParameterProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentEventFilterParameterProjection<PARENT, ROOT> acceptsMultipleValues() {
    getFields().put("acceptsMultipleValues", null);
    return this;
  }

  public SegmentEventFilterParameterProjection<PARENT, ROOT> localizedDescription() {
    getFields().put("localizedDescription", null);
    return this;
  }

  public SegmentEventFilterParameterProjection<PARENT, ROOT> localizedName() {
    getFields().put("localizedName", null);
    return this;
  }

  public SegmentEventFilterParameterProjection<PARENT, ROOT> optional() {
    getFields().put("optional", null);
    return this;
  }

  public SegmentEventFilterParameterProjection<PARENT, ROOT> parameterType() {
    getFields().put("parameterType", null);
    return this;
  }

  public SegmentEventFilterParameterProjection<PARENT, ROOT> queryName() {
    getFields().put("queryName", null);
    return this;
  }
}
