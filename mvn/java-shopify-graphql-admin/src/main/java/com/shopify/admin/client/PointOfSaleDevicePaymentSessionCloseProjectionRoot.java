package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionCloseProjectionRoot() {
    super(null, null, java.util.Optional.of("PointOfSaleDevicePaymentSessionClosePayload"));
  }

  public PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT, ROOT>> pointOfSaleDevicePaymentSession(
      ) {
    PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, this);    
    getFields().put("pointOfSaleDevicePaymentSession", projection);
    return projection;
  }

  public PointOfSaleDevicePaymentSessionCloseUserErrorProjection<PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PointOfSaleDevicePaymentSessionCloseUserErrorProjection<PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionCloseProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionCloseUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
