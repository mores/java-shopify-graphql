package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PointOfSaleDevicePaymentSessionEdge"));
  }

  public PointOfSaleDevicePaymentSessionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionEdgeProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
