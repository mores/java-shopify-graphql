package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DeliveryParticipantFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryParticipantFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryParticipant"));
  }

  public DeliveryParticipantFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<DeliveryParticipantFragmentProjection<PARENT, ROOT>, ROOT> carrierService(
      ) {
     DeliveryCarrierServiceProjection<DeliveryParticipantFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());
     getFields().put("carrierService", projection);
     return projection;
  }

  public MoneyV2Projection<DeliveryParticipantFragmentProjection<PARENT, ROOT>, ROOT> fixedFee() {
     MoneyV2Projection<DeliveryParticipantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("fixedFee", projection);
     return projection;
  }

  public DeliveryParticipantServiceProjection<DeliveryParticipantFragmentProjection<PARENT, ROOT>, ROOT> participantServices(
      ) {
     DeliveryParticipantServiceProjection<DeliveryParticipantFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryParticipantServiceProjection<>(this, getRoot());
     getFields().put("participantServices", projection);
     return projection;
  }

  public DeliveryParticipantFragmentProjection<PARENT, ROOT> adaptToNewServicesFlag() {
    getFields().put("adaptToNewServicesFlag", null);
    return this;
  }

  public DeliveryParticipantFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryParticipantFragmentProjection<PARENT, ROOT> percentageOfRateFee() {
    getFields().put("percentageOfRateFee", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryParticipant {");
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
