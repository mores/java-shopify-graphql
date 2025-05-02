package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubmitSuccessFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubmitSuccessFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubmitSuccess"));
  }

  public SubmitSuccessFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubmitSuccessFragmentProjection<PARENT, ROOT> attemptId() {
    getFields().put("attemptId", null);
    return this;
  }

  public SubmitSuccessFragmentProjection<PARENT, ROOT> redirectUrl() {
    getFields().put("redirectUrl", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubmitSuccess {");
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
