package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FailedRequirementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FailedRequirementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FailedRequirement"));
  }

  public FailedRequirementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public NavigationItemProjection<FailedRequirementProjection<PARENT, ROOT>, ROOT> action() {
     NavigationItemProjection<FailedRequirementProjection<PARENT, ROOT>, ROOT> projection = new NavigationItemProjection<>(this, getRoot());
     getFields().put("action", projection);
     return projection;
  }

  public FailedRequirementProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
