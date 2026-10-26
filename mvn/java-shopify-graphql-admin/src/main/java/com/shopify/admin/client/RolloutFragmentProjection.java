package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class RolloutFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RolloutFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Rollout"));
  }

  public RolloutFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutScheduleProjection<RolloutFragmentProjection<PARENT, ROOT>, ROOT> schedule() {
     RolloutScheduleProjection<RolloutFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutScheduleProjection<>(this, getRoot());
     getFields().put("schedule", projection);
     return projection;
  }

  public RolloutStatusProjection<RolloutFragmentProjection<PARENT, ROOT>, ROOT> status() {
     RolloutStatusProjection<RolloutFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public RolloutTreatmentProjection<RolloutFragmentProjection<PARENT, ROOT>, ROOT> treatments() {
     RolloutTreatmentProjection<RolloutFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutTreatmentProjection<>(this, getRoot());
     getFields().put("treatments", projection);
     return projection;
  }

  public RolloutFragmentProjection<PARENT, ROOT> archivedAt() {
    getFields().put("archivedAt", null);
    return this;
  }

  public RolloutFragmentProjection<PARENT, ROOT> concludedAt() {
    getFields().put("concludedAt", null);
    return this;
  }

  public RolloutFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public RolloutFragmentProjection<PARENT, ROOT> effectiveTrafficAllocation() {
    getFields().put("effectiveTrafficAllocation", null);
    return this;
  }

  public RolloutFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RolloutFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public RolloutFragmentProjection<PARENT, ROOT> startedAt() {
    getFields().put("startedAt", null);
    return this;
  }

  public RolloutFragmentProjection<PARENT, ROOT> trafficAllocation() {
    getFields().put("trafficAllocation", null);
    return this;
  }

  public RolloutFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Rollout {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
