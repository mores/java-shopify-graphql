package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductUpdatePayload"));
  }

  public ProductUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductUpdateProjectionRoot<PARENT, ROOT>, ProductUpdateProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductUpdateProjectionRoot<PARENT, ROOT>, ProductUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public UserErrorProjection<ProductUpdateProjectionRoot<PARENT, ROOT>, ProductUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductUpdateProjectionRoot<PARENT, ROOT>, ProductUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
