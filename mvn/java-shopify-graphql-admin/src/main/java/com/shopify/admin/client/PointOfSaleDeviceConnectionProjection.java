package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDeviceConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDeviceConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PointOfSaleDeviceConnection"));
  }

  public PointOfSaleDeviceConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDeviceEdgeProjection<PointOfSaleDeviceConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     PointOfSaleDeviceEdgeProjection<PointOfSaleDeviceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PointOfSaleDeviceProjection<PointOfSaleDeviceConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     PointOfSaleDeviceProjection<PointOfSaleDeviceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PointOfSaleDeviceConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<PointOfSaleDeviceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
