package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDeleteMediaProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDeleteMediaProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductDeleteMediaPayload"));
  }

  public ProductDeleteMediaProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaUserErrorProjection<ProductDeleteMediaProjectionRoot<PARENT, ROOT>, ProductDeleteMediaProjectionRoot<PARENT, ROOT>> mediaUserErrors(
      ) {
    MediaUserErrorProjection<ProductDeleteMediaProjectionRoot<PARENT, ROOT>, ProductDeleteMediaProjectionRoot<PARENT, ROOT>> projection = new MediaUserErrorProjection<>(this, this);    
    getFields().put("mediaUserErrors", projection);
    return projection;
  }

  public ProductProjection<ProductDeleteMediaProjectionRoot<PARENT, ROOT>, ProductDeleteMediaProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductDeleteMediaProjectionRoot<PARENT, ROOT>, ProductDeleteMediaProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public UserErrorProjection<ProductDeleteMediaProjectionRoot<PARENT, ROOT>, ProductDeleteMediaProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductDeleteMediaProjectionRoot<PARENT, ROOT>, ProductDeleteMediaProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ProductDeleteMediaProjectionRoot<PARENT, ROOT> deletedMediaIds() {
    getFields().put("deletedMediaIds", null);
    return this;
  }

  public ProductDeleteMediaProjectionRoot<PARENT, ROOT> deletedProductImageIds() {
    getFields().put("deletedProductImageIds", null);
    return this;
  }
}
