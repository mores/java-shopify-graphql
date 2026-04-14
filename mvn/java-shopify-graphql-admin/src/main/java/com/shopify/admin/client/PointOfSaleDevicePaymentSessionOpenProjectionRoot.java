package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionOpenProjectionRoot() {
    super(null, null, java.util.Optional.of("PointOfSaleDevicePaymentSessionOpenPayload"));
  }

  public PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT, ROOT>> pointOfSaleDevicePaymentSession(
      ) {
    PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, this);    
    getFields().put("pointOfSaleDevicePaymentSession", projection);
    return projection;
  }

  public PointOfSaleDevicePaymentSessionOpenUserErrorProjection<PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PointOfSaleDevicePaymentSessionOpenUserErrorProjection<PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionOpenProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionOpenUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
