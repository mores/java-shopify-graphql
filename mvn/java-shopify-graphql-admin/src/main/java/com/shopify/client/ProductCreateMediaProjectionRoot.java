package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductCreateMediaProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductCreateMediaProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductCreateMediaPayload"));
  }

  public ProductCreateMediaProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaProjection<ProductCreateMediaProjectionRoot<PARENT, ROOT>, ProductCreateMediaProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaProjection<ProductCreateMediaProjectionRoot<PARENT, ROOT>, ProductCreateMediaProjectionRoot<PARENT, ROOT>> projection = new MediaProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaUserErrorProjection<ProductCreateMediaProjectionRoot<PARENT, ROOT>, ProductCreateMediaProjectionRoot<PARENT, ROOT>> mediaUserErrors(
      ) {
    MediaUserErrorProjection<ProductCreateMediaProjectionRoot<PARENT, ROOT>, ProductCreateMediaProjectionRoot<PARENT, ROOT>> projection = new MediaUserErrorProjection<>(this, this);    
    getFields().put("mediaUserErrors", projection);
    return projection;
  }

  public ProductProjection<ProductCreateMediaProjectionRoot<PARENT, ROOT>, ProductCreateMediaProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductCreateMediaProjectionRoot<PARENT, ROOT>, ProductCreateMediaProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public UserErrorProjection<ProductCreateMediaProjectionRoot<PARENT, ROOT>, ProductCreateMediaProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductCreateMediaProjectionRoot<PARENT, ROOT>, ProductCreateMediaProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
