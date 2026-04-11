package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionCountUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionCountUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PointOfSaleDevicePaymentSessionCountUserError"));
  }

  public PointOfSaleDevicePaymentSessionCountUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionCountUserErrorCodeProjection<PointOfSaleDevicePaymentSessionCountUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PointOfSaleDevicePaymentSessionCountUserErrorCodeProjection<PointOfSaleDevicePaymentSessionCountUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionCountUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionCountUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionCountUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
