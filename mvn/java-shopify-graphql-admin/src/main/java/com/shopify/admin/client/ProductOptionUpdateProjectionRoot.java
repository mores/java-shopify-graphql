package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOptionUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductOptionUpdatePayload"));
  }

  public ProductOptionUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductOptionUpdateProjectionRoot<PARENT, ROOT>, ProductOptionUpdateProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductOptionUpdateProjectionRoot<PARENT, ROOT>, ProductOptionUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductOptionUpdateUserErrorProjection<ProductOptionUpdateProjectionRoot<PARENT, ROOT>, ProductOptionUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductOptionUpdateUserErrorProjection<ProductOptionUpdateProjectionRoot<PARENT, ROOT>, ProductOptionUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductOptionUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
