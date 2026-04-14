package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDevicePaymentSessionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PointOfSaleDevicePaymentSessionConnection"));
  }

  public PointOfSaleDevicePaymentSessionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionEdgeProjection<PointOfSaleDevicePaymentSessionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     PointOfSaleDevicePaymentSessionEdgeProjection<PointOfSaleDevicePaymentSessionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     PointOfSaleDevicePaymentSessionProjection<PointOfSaleDevicePaymentSessionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PointOfSaleDevicePaymentSessionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<PointOfSaleDevicePaymentSessionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
