package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SegmentDateFilterFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SegmentDateFilterFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentDateFilter"));
  }

  public SegmentDateFilterFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentDateFilterFragmentProjection<PARENT, ROOT> localizedName() {
    getFields().put("localizedName", null);
    return this;
  }

  public SegmentDateFilterFragmentProjection<PARENT, ROOT> multiValue() {
    getFields().put("multiValue", null);
    return this;
  }

  public SegmentDateFilterFragmentProjection<PARENT, ROOT> queryName() {
    getFields().put("queryName", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SegmentDateFilter {");
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
