package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubmitAlreadyAcceptedFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubmitAlreadyAcceptedFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubmitAlreadyAccepted"));
  }

  public SubmitAlreadyAcceptedFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubmitAlreadyAcceptedFragmentProjection<PARENT, ROOT> attemptId() {
    getFields().put("attemptId", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubmitAlreadyAccepted {");
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
