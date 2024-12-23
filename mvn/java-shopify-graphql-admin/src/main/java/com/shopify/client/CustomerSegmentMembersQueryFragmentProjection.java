package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CustomerSegmentMembersQueryFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerSegmentMembersQueryFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSegmentMembersQuery"));
  }

  public CustomerSegmentMembersQueryFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSegmentMembersQueryFragmentProjection<PARENT, ROOT> currentCount() {
    getFields().put("currentCount", null);
    return this;
  }

  public CustomerSegmentMembersQueryFragmentProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public CustomerSegmentMembersQueryFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CustomerSegmentMembersQuery {");
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
