package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionAdjustProjectionRoot() {
    super(null, null, java.util.Optional.of("PointOfSaleDevicePaymentSessionAdjustPayload"));
  }

  public PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT, ROOT>> pointOfSaleDevicePaymentSession(
      ) {
    PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, this);    
    getFields().put("pointOfSaleDevicePaymentSession", projection);
    return projection;
  }

  public UserErrorProjection<PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionAdjustProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
