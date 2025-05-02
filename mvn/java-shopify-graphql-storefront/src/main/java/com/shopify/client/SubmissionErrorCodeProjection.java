package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubmissionErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubmissionErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubmissionErrorCode"));
  }

  public SubmissionErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
