package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubmissionErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubmissionErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubmissionError"));
  }

  public SubmissionErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubmissionErrorCodeProjection<SubmissionErrorProjection<PARENT, ROOT>, ROOT> code() {
     SubmissionErrorCodeProjection<SubmissionErrorProjection<PARENT, ROOT>, ROOT> projection = new SubmissionErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubmissionErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
