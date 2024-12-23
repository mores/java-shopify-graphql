package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SegmentEventFilterFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SegmentEventFilterFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentEventFilter"));
  }

  public SegmentEventFilterFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentEventFilterParameterProjection<SegmentEventFilterFragmentProjection<PARENT, ROOT>, ROOT> parameters(
      ) {
     SegmentEventFilterParameterProjection<SegmentEventFilterFragmentProjection<PARENT, ROOT>, ROOT> projection = new SegmentEventFilterParameterProjection<>(this, getRoot());
     getFields().put("parameters", projection);
     return projection;
  }

  public SegmentEventFilterFragmentProjection<PARENT, ROOT> localizedName() {
    getFields().put("localizedName", null);
    return this;
  }

  public SegmentEventFilterFragmentProjection<PARENT, ROOT> multiValue() {
    getFields().put("multiValue", null);
    return this;
  }

  public SegmentEventFilterFragmentProjection<PARENT, ROOT> queryName() {
    getFields().put("queryName", null);
    return this;
  }

  public SegmentEventFilterFragmentProjection<PARENT, ROOT> returnValueType() {
    getFields().put("returnValueType", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SegmentEventFilter {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
