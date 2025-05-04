package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryTrackingV2Projection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryTrackingV2Projection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryTrackingV2"));
  }

  public ReverseDeliveryTrackingV2Projection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryTrackingV2Projection<PARENT, ROOT> carrierName() {
    getFields().put("carrierName", null);
    return this;
  }

  public ReverseDeliveryTrackingV2Projection<PARENT, ROOT> number() {
    getFields().put("number", null);
    return this;
  }

  public ReverseDeliveryTrackingV2Projection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
