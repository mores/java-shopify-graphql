package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourceFeedbackStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourceFeedbackStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourceFeedbackState"));
  }

  public ResourceFeedbackStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
