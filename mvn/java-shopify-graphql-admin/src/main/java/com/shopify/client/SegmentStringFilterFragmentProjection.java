package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SegmentStringFilterFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SegmentStringFilterFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentStringFilter"));
  }

  public SegmentStringFilterFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentStringFilterFragmentProjection<PARENT, ROOT> localizedName() {
    getFields().put("localizedName", null);
    return this;
  }

  public SegmentStringFilterFragmentProjection<PARENT, ROOT> multiValue() {
    getFields().put("multiValue", null);
    return this;
  }

  public SegmentStringFilterFragmentProjection<PARENT, ROOT> queryName() {
    getFields().put("queryName", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SegmentStringFilter {");
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
