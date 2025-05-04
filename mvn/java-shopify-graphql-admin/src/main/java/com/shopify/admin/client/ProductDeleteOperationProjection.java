package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDeleteOperationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDeleteOperationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductDeleteOperation"));
  }

  public ProductDeleteOperationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductDeleteOperationProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductDeleteOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductOperationStatusProjection<ProductDeleteOperationProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ProductOperationStatusProjection<ProductDeleteOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public UserErrorProjection<ProductDeleteOperationProjection<PARENT, ROOT>, ROOT> userErrors() {
     UserErrorProjection<ProductDeleteOperationProjection<PARENT, ROOT>, ROOT> projection = new UserErrorProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }

  public ProductDeleteOperationProjection<PARENT, ROOT> deletedProductId() {
    getFields().put("deletedProductId", null);
    return this;
  }

  public ProductDeleteOperationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
