package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SegmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SegmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Segment"));
  }

  public SegmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentFragmentProjection<PARENT, ROOT> creationDate() {
    getFields().put("creationDate", null);
    return this;
  }

  public SegmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SegmentFragmentProjection<PARENT, ROOT> lastEditDate() {
    getFields().put("lastEditDate", null);
    return this;
  }

  public SegmentFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SegmentFragmentProjection<PARENT, ROOT> query() {
    getFields().put("query", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Segment {");
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
