package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingPackageDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingPackageDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ShippingPackageDeletePayload"));
  }

  public ShippingPackageDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<ShippingPackageDeleteProjectionRoot<PARENT, ROOT>, ShippingPackageDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ShippingPackageDeleteProjectionRoot<PARENT, ROOT>, ShippingPackageDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ShippingPackageDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
