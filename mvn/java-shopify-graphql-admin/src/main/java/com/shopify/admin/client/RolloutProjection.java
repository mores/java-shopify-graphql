package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RolloutProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Rollout"));
  }

  public RolloutProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutScheduleProjection<RolloutProjection<PARENT, ROOT>, ROOT> schedule() {
     RolloutScheduleProjection<RolloutProjection<PARENT, ROOT>, ROOT> projection = new RolloutScheduleProjection<>(this, getRoot());
     getFields().put("schedule", projection);
     return projection;
  }

  public RolloutStatusProjection<RolloutProjection<PARENT, ROOT>, ROOT> status() {
     RolloutStatusProjection<RolloutProjection<PARENT, ROOT>, ROOT> projection = new RolloutStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public RolloutTreatmentProjection<RolloutProjection<PARENT, ROOT>, ROOT> treatments() {
     RolloutTreatmentProjection<RolloutProjection<PARENT, ROOT>, ROOT> projection = new RolloutTreatmentProjection<>(this, getRoot());
     getFields().put("treatments", projection);
     return projection;
  }

  public RolloutProjection<PARENT, ROOT> archivedAt() {
    getFields().put("archivedAt", null);
    return this;
  }

  public RolloutProjection<PARENT, ROOT> concludedAt() {
    getFields().put("concludedAt", null);
    return this;
  }

  public RolloutProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public RolloutProjection<PARENT, ROOT> effectiveTrafficAllocation() {
    getFields().put("effectiveTrafficAllocation", null);
    return this;
  }

  public RolloutProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RolloutProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public RolloutProjection<PARENT, ROOT> startedAt() {
    getFields().put("startedAt", null);
    return this;
  }

  public RolloutProjection<PARENT, ROOT> trafficAllocation() {
    getFields().put("trafficAllocation", null);
    return this;
  }

  public RolloutProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
