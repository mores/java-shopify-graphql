package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DeliveryPromiseParticipantFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryPromiseParticipantFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromiseParticipant"));
  }

  public DeliveryPromiseParticipantFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromiseParticipantOwnerProjection<DeliveryPromiseParticipantFragmentProjection<PARENT, ROOT>, ROOT> owner(
      ) {
     DeliveryPromiseParticipantOwnerProjection<DeliveryPromiseParticipantFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseParticipantOwnerProjection<>(this, getRoot());
     getFields().put("owner", projection);
     return projection;
  }

  public DeliveryPromiseParticipantOwnerTypeProjection<DeliveryPromiseParticipantFragmentProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     DeliveryPromiseParticipantOwnerTypeProjection<DeliveryPromiseParticipantFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseParticipantOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public DeliveryPromiseParticipantFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryPromiseParticipant {");
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
