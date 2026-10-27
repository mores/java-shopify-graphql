package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RolloutProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutProjectionRoot() {
    super(null, null, java.util.Optional.of("Rollout"));
  }

  public RolloutProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutScheduleProjection<RolloutProjectionRoot<PARENT, ROOT>, RolloutProjectionRoot<PARENT, ROOT>> schedule(
      ) {
    RolloutScheduleProjection<RolloutProjectionRoot<PARENT, ROOT>, RolloutProjectionRoot<PARENT, ROOT>> projection = new RolloutScheduleProjection<>(this, this);    
    getFields().put("schedule", projection);
    return projection;
  }

  public RolloutStatusProjection<RolloutProjectionRoot<PARENT, ROOT>, RolloutProjectionRoot<PARENT, ROOT>> status(
      ) {
    RolloutStatusProjection<RolloutProjectionRoot<PARENT, ROOT>, RolloutProjectionRoot<PARENT, ROOT>> projection = new RolloutStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public RolloutTreatmentProjection<RolloutProjectionRoot<PARENT, ROOT>, RolloutProjectionRoot<PARENT, ROOT>> treatments(
      ) {
    RolloutTreatmentProjection<RolloutProjectionRoot<PARENT, ROOT>, RolloutProjectionRoot<PARENT, ROOT>> projection = new RolloutTreatmentProjection<>(this, this);    
    getFields().put("treatments", projection);
    return projection;
  }

  public RolloutProjectionRoot<PARENT, ROOT> archivedAt() {
    getFields().put("archivedAt", null);
    return this;
  }

  public RolloutProjectionRoot<PARENT, ROOT> concludedAt() {
    getFields().put("concludedAt", null);
    return this;
  }

  public RolloutProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public RolloutProjectionRoot<PARENT, ROOT> effectiveTrafficAllocation() {
    getFields().put("effectiveTrafficAllocation", null);
    return this;
  }

  public RolloutProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RolloutProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public RolloutProjectionRoot<PARENT, ROOT> startedAt() {
    getFields().put("startedAt", null);
    return this;
  }

  public RolloutProjectionRoot<PARENT, ROOT> trafficAllocation() {
    getFields().put("trafficAllocation", null);
    return this;
  }

  public RolloutProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
