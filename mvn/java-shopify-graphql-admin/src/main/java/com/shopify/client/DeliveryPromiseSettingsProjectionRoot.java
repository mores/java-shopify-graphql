package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseSettingsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseSettingsProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryPromiseSetting"));
  }

  public DeliveryPromiseSettingsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromiseSettingsProjectionRoot<PARENT, ROOT> deliveryDatesEnabled() {
    getFields().put("deliveryDatesEnabled", null);
    return this;
  }

  public DeliveryPromiseSettingsProjectionRoot<PARENT, ROOT> processingTime() {
    getFields().put("processingTime", null);
    return this;
  }
}
