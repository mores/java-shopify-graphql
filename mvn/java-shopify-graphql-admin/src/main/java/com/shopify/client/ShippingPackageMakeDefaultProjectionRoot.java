package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingPackageMakeDefaultProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingPackageMakeDefaultProjectionRoot() {
    super(null, null, java.util.Optional.of("ShippingPackageMakeDefaultPayload"));
  }

  public ShippingPackageMakeDefaultProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<ShippingPackageMakeDefaultProjectionRoot<PARENT, ROOT>, ShippingPackageMakeDefaultProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ShippingPackageMakeDefaultProjectionRoot<PARENT, ROOT>, ShippingPackageMakeDefaultProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
