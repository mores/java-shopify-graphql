package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOptionsDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionsDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductOptionsDeletePayload"));
  }

  public ProductOptionsDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductOptionsDeleteProjectionRoot<PARENT, ROOT>, ProductOptionsDeleteProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductOptionsDeleteProjectionRoot<PARENT, ROOT>, ProductOptionsDeleteProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductOptionsDeleteUserErrorProjection<ProductOptionsDeleteProjectionRoot<PARENT, ROOT>, ProductOptionsDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductOptionsDeleteUserErrorProjection<ProductOptionsDeleteProjectionRoot<PARENT, ROOT>, ProductOptionsDeleteProjectionRoot<PARENT, ROOT>> projection = new ProductOptionsDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ProductOptionsDeleteProjectionRoot<PARENT, ROOT> deletedOptionsIds() {
    getFields().put("deletedOptionsIds", null);
    return this;
  }
}
