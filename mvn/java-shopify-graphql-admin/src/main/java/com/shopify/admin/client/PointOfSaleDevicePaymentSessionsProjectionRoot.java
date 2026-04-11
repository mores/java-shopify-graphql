package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionsProjectionRoot() {
    super(null, null, java.util.Optional.of("PointOfSaleDevicePaymentSessionConnection"));
  }

  public PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionEdgeProjection<PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    PointOfSaleDevicePaymentSessionEdgeProjection<PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
