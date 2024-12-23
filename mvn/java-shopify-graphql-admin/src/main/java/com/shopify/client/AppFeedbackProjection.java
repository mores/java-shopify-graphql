package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppFeedbackProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppFeedbackProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppFeedback"));
  }

  public AppFeedbackProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<AppFeedbackProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<AppFeedbackProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public LinkProjection<AppFeedbackProjection<PARENT, ROOT>, ROOT> link() {
     LinkProjection<AppFeedbackProjection<PARENT, ROOT>, ROOT> projection = new LinkProjection<>(this, getRoot());
     getFields().put("link", projection);
     return projection;
  }

  public UserErrorProjection<AppFeedbackProjection<PARENT, ROOT>, ROOT> messages() {
     UserErrorProjection<AppFeedbackProjection<PARENT, ROOT>, ROOT> projection = new UserErrorProjection<>(this, getRoot());
     getFields().put("messages", projection);
     return projection;
  }

  public ResourceFeedbackStateProjection<AppFeedbackProjection<PARENT, ROOT>, ROOT> state() {
     ResourceFeedbackStateProjection<AppFeedbackProjection<PARENT, ROOT>, ROOT> projection = new ResourceFeedbackStateProjection<>(this, getRoot());
     getFields().put("state", projection);
     return projection;
  }

  public AppFeedbackProjection<PARENT, ROOT> feedbackGeneratedAt() {
    getFields().put("feedbackGeneratedAt", null);
    return this;
  }
}
