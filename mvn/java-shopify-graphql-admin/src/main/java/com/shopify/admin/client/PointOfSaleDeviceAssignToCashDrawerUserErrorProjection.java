package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDeviceAssignToCashDrawerUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDeviceAssignToCashDrawerUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PointOfSaleDeviceAssignToCashDrawerUserError"));
  }

  public PointOfSaleDeviceAssignToCashDrawerUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDeviceAssignToCashDrawerUserErrorCodeProjection<PointOfSaleDeviceAssignToCashDrawerUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PointOfSaleDeviceAssignToCashDrawerUserErrorCodeProjection<PointOfSaleDeviceAssignToCashDrawerUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceAssignToCashDrawerUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PointOfSaleDeviceAssignToCashDrawerUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PointOfSaleDeviceAssignToCashDrawerUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
