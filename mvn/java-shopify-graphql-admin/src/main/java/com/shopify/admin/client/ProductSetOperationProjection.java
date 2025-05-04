package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductSetOperationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductSetOperationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductSetOperation"));
  }

  public ProductSetOperationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductSetOperationProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductSetOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductOperationStatusProjection<ProductSetOperationProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ProductOperationStatusProjection<ProductSetOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ProductSetUserErrorProjection<ProductSetOperationProjection<PARENT, ROOT>, ROOT> userErrors(
      ) {
     ProductSetUserErrorProjection<ProductSetOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductSetUserErrorProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }

  public ProductSetOperationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
