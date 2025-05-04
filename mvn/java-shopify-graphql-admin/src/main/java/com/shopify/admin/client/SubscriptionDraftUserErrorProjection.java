package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDraftUserError"));
  }

  public SubscriptionDraftUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDraftErrorCodeProjection<SubscriptionDraftUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionDraftErrorCodeProjection<SubscriptionDraftUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDraftErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionDraftUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SubscriptionDraftUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
