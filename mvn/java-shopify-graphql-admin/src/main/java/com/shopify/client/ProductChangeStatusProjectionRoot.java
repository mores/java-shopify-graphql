package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductChangeStatusProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductChangeStatusProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductChangeStatusPayload"));
  }

  public ProductChangeStatusProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductChangeStatusProjectionRoot<PARENT, ROOT>, ProductChangeStatusProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductChangeStatusProjectionRoot<PARENT, ROOT>, ProductChangeStatusProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductChangeStatusUserErrorProjection<ProductChangeStatusProjectionRoot<PARENT, ROOT>, ProductChangeStatusProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductChangeStatusUserErrorProjection<ProductChangeStatusProjectionRoot<PARENT, ROOT>, ProductChangeStatusProjectionRoot<PARENT, ROOT>> projection = new ProductChangeStatusUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
