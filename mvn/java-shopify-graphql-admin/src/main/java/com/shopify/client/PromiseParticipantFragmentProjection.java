package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class PromiseParticipantFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PromiseParticipantFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PromiseParticipant"));
  }

  public PromiseParticipantFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<PromiseParticipantFragmentProjection<PARENT, ROOT>, ROOT> owner(
      ) {
     DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<PromiseParticipantFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<>(this, getRoot());
     getFields().put("owner", projection);
     return projection;
  }

  public DeliveryPromisePromiseParticipantParticipantOwnerTypeProjection<PromiseParticipantFragmentProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     DeliveryPromisePromiseParticipantParticipantOwnerTypeProjection<PromiseParticipantFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromisePromiseParticipantParticipantOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public PromiseParticipantFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PromiseParticipant {");
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
