package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ReverseDeliveryShippingDeliverableFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReverseDeliveryShippingDeliverableFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryShippingDeliverable"));
  }

  public ReverseDeliveryShippingDeliverableFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryLabelV2Projection<ReverseDeliveryShippingDeliverableFragmentProjection<PARENT, ROOT>, ROOT> label(
      ) {
     ReverseDeliveryLabelV2Projection<ReverseDeliveryShippingDeliverableFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryLabelV2Projection<>(this, getRoot());
     getFields().put("label", projection);
     return projection;
  }

  public ReverseDeliveryTrackingV2Projection<ReverseDeliveryShippingDeliverableFragmentProjection<PARENT, ROOT>, ROOT> tracking(
      ) {
     ReverseDeliveryTrackingV2Projection<ReverseDeliveryShippingDeliverableFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryTrackingV2Projection<>(this, getRoot());
     getFields().put("tracking", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ReverseDeliveryShippingDeliverable {");
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
