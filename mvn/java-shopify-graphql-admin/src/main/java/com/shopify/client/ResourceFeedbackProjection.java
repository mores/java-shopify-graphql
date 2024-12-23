package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourceFeedbackProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourceFeedbackProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourceFeedback"));
  }

  public ResourceFeedbackProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppFeedbackProjection<ResourceFeedbackProjection<PARENT, ROOT>, ROOT> appFeedback() {
     AppFeedbackProjection<ResourceFeedbackProjection<PARENT, ROOT>, ROOT> projection = new AppFeedbackProjection<>(this, getRoot());
     getFields().put("appFeedback", projection);
     return projection;
  }

  public AppFeedbackProjection<ResourceFeedbackProjection<PARENT, ROOT>, ROOT> details() {
     AppFeedbackProjection<ResourceFeedbackProjection<PARENT, ROOT>, ROOT> projection = new AppFeedbackProjection<>(this, getRoot());
     getFields().put("details", projection);
     return projection;
  }

  public ResourceFeedbackProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }
}
