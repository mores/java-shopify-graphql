package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionCountProjectionRoot() {
    super(null, null, java.util.Optional.of("PointOfSaleDevicePaymentSessionCountPayload"));
  }

  public PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT, ROOT>> pointOfSaleDevicePaymentSession(
      ) {
    PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, this);    
    getFields().put("pointOfSaleDevicePaymentSession", projection);
    return projection;
  }

  public PointOfSaleDevicePaymentSessionCountUserErrorProjection<PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PointOfSaleDevicePaymentSessionCountUserErrorProjection<PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionCountProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionCountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
