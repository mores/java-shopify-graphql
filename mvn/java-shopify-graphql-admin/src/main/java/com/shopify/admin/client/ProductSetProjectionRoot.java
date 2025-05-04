package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductSetProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductSetProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductSetPayload"));
  }

  public ProductSetProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductSetProjectionRoot<PARENT, ROOT>, ProductSetProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductSetProjectionRoot<PARENT, ROOT>, ProductSetProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductSetOperationProjection<ProductSetProjectionRoot<PARENT, ROOT>, ProductSetProjectionRoot<PARENT, ROOT>> productSetOperation(
      ) {
    ProductSetOperationProjection<ProductSetProjectionRoot<PARENT, ROOT>, ProductSetProjectionRoot<PARENT, ROOT>> projection = new ProductSetOperationProjection<>(this, this);    
    getFields().put("productSetOperation", projection);
    return projection;
  }

  public ProductSetUserErrorProjection<ProductSetProjectionRoot<PARENT, ROOT>, ProductSetProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductSetUserErrorProjection<ProductSetProjectionRoot<PARENT, ROOT>, ProductSetProjectionRoot<PARENT, ROOT>> projection = new ProductSetUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
