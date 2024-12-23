package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOptionsCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionsCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductOptionsCreatePayload"));
  }

  public ProductOptionsCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductOptionsCreateProjectionRoot<PARENT, ROOT>, ProductOptionsCreateProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductOptionsCreateProjectionRoot<PARENT, ROOT>, ProductOptionsCreateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductOptionsCreateUserErrorProjection<ProductOptionsCreateProjectionRoot<PARENT, ROOT>, ProductOptionsCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductOptionsCreateUserErrorProjection<ProductOptionsCreateProjectionRoot<PARENT, ROOT>, ProductOptionsCreateProjectionRoot<PARENT, ROOT>> projection = new ProductOptionsCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
