package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDeviceAssignToCashDrawerProjectionRoot() {
    super(null, null, java.util.Optional.of("PointOfSaleDeviceAssignToCashDrawerPayload"));
  }

  public PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDeviceProjection<PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT, ROOT>, PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT, ROOT>> pointOfSaleDevice(
      ) {
    PointOfSaleDeviceProjection<PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT, ROOT>, PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDeviceProjection<>(this, this);    
    getFields().put("pointOfSaleDevice", projection);
    return projection;
  }

  public PointOfSaleDeviceAssignToCashDrawerUserErrorProjection<PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT, ROOT>, PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PointOfSaleDeviceAssignToCashDrawerUserErrorProjection<PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT, ROOT>, PointOfSaleDeviceAssignToCashDrawerProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDeviceAssignToCashDrawerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
