package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RolloutScheduleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutScheduleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutSchedule"));
  }

  public RolloutScheduleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutScheduleProjection<PARENT, ROOT> activateAt() {
    getFields().put("activateAt", null);
    return this;
  }

  public RolloutScheduleProjection<PARENT, ROOT> concludeAt() {
    getFields().put("concludeAt", null);
    return this;
  }
}
