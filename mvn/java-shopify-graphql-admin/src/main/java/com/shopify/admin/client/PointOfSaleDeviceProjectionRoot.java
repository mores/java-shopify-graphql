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

  public PointOfSaleDeviceProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
