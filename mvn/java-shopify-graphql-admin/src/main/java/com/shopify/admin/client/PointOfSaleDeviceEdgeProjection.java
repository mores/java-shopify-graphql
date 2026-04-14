package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PointOfSaleDeviceEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDeviceEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PointOfSaleDeviceEdge"));
  }

  public PointOfSaleDeviceEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PointOfSaleDeviceProjection<PointOfSaleDeviceEdgeProjection<PARENT, ROOT>, ROOT> node() {
     PointOfSaleDeviceProjection<PointOfSaleDeviceEdgeProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PointOfSaleDeviceEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
