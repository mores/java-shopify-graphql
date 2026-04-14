package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionCloseUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionCloseUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PointOfSaleDevicePaymentSessionCloseUserError"));
  }

  public PointOfSaleDevicePaymentSessionCloseUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionCloseUserErrorCodeProjection<PointOfSaleDevicePaymentSessionCloseUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PointOfSaleDevicePaymentSessionCloseUserErrorCodeProjection<PointOfSaleDevicePaymentSessionCloseUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionCloseUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionCloseUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionCloseUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
