package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductUpdateMediaProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductUpdateMediaProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductUpdateMediaPayload"));
  }

  public ProductUpdateMediaProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaProjection<ProductUpdateMediaProjectionRoot<PARENT, ROOT>, ProductUpdateMediaProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaProjection<ProductUpdateMediaProjectionRoot<PARENT, ROOT>, ProductUpdateMediaProjectionRoot<PARENT, ROOT>> projection = new MediaProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaUserErrorProjection<ProductUpdateMediaProjectionRoot<PARENT, ROOT>, ProductUpdateMediaProjectionRoot<PARENT, ROOT>> mediaUserErrors(
      ) {
    MediaUserErrorProjection<ProductUpdateMediaProjectionRoot<PARENT, ROOT>, ProductUpdateMediaProjectionRoot<PARENT, ROOT>> projection = new MediaUserErrorProjection<>(this, this);    
    getFields().put("mediaUserErrors", projection);
    return projection;
  }

  public ProductProjection<ProductUpdateMediaProjectionRoot<PARENT, ROOT>, ProductUpdateMediaProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductUpdateMediaProjectionRoot<PARENT, ROOT>, ProductUpdateMediaProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public UserErrorProjection<ProductUpdateMediaProjectionRoot<PARENT, ROOT>, ProductUpdateMediaProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductUpdateMediaProjectionRoot<PARENT, ROOT>, ProductUpdateMediaProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
