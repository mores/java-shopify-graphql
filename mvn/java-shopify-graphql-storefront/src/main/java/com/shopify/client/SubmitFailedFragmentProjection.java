package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubmitFailedFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubmitFailedFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubmitFailed"));
  }

  public SubmitFailedFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubmissionErrorProjection<SubmitFailedFragmentProjection<PARENT, ROOT>, ROOT> errors() {
     SubmissionErrorProjection<SubmitFailedFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubmissionErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public SubmitFailedFragmentProjection<PARENT, ROOT> checkoutUrl() {
    getFields().put("checkoutUrl", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubmitFailed {");
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
