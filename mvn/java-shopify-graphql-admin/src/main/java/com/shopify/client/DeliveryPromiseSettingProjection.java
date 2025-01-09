package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseSettingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseSettingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromiseSetting"));
  }

  public DeliveryPromiseSettingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromiseSettingProjection<PARENT, ROOT> deliveryDatesEnabled() {
    getFields().put("deliveryDatesEnabled", null);
    return this;
  }

  public DeliveryPromiseSettingProjection<PARENT, ROOT> processingTime() {
    getFields().put("processingTime", null);
    return this;
  }
}
