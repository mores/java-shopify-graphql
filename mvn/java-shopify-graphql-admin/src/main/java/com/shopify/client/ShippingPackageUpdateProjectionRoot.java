package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingPackageUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingPackageUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ShippingPackageUpdatePayload"));
  }

  public ShippingPackageUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<ShippingPackageUpdateProjectionRoot<PARENT, ROOT>, ShippingPackageUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ShippingPackageUpdateProjectionRoot<PARENT, ROOT>, ShippingPackageUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
