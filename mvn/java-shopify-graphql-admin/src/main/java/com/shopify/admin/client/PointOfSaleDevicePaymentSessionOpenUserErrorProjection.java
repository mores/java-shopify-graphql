package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionOpenUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionOpenUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PointOfSaleDevicePaymentSessionOpenUserError"));
  }

  public PointOfSaleDevicePaymentSessionOpenUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionOpenUserErrorCodeProjection<PointOfSaleDevicePaymentSessionOpenUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PointOfSaleDevicePaymentSessionOpenUserErrorCodeProjection<PointOfSaleDevicePaymentSessionOpenUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionOpenUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionOpenUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionOpenUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
