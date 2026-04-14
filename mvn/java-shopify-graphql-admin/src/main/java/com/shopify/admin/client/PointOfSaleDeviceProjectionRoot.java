package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDeviceProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDeviceProjectionRoot() {
    super(null, null, java.util.Optional.of("PointOfSaleDevice"));
  }

  public PointOfSaleDeviceProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PointOfSaleDeviceProjectionRoot<PARENT, ROOT>, PointOfSaleDeviceProjectionRoot<PARENT, ROOT>> activePaymentSession(
      ) {
    PointOfSaleDevicePaymentSessionProjection<PointOfSaleDeviceProjectionRoot<PARENT, ROOT>, PointOfSaleDeviceProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, this);    
    getFields().put("activePaymentSession", projection);
    return projection;
  }

  public CashDrawerProjection<PointOfSaleDeviceProjectionRoot<PARENT, ROOT>, PointOfSaleDeviceProjectionRoot<PARENT, ROOT>> cashDrawer(
      ) {
    CashDrawerProjection<PointOfSaleDeviceProjectionRoot<PARENT, ROOT>, PointOfSaleDeviceProjectionRoot<PARENT, ROOT>> projection = new CashDrawerProjection<>(this, this);    
    getFields().put("cashDrawer", projection);
    return projection;
  }

  public PointOfSaleDeviceProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
