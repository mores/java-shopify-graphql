package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductDuplicateOperationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductDuplicateOperationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductDuplicateOperation"));
  }

  public ProductDuplicateOperationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductDuplicateOperationProjection<PARENT, ROOT>, ROOT> newProduct() {
     ProductProjection<ProductDuplicateOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("newProduct", projection);
     return projection;
  }

  public ProductProjection<ProductDuplicateOperationProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductDuplicateOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductOperationStatusProjection<ProductDuplicateOperationProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ProductOperationStatusProjection<ProductDuplicateOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public UserErrorProjection<ProductDuplicateOperationProjection<PARENT, ROOT>, ROOT> userErrors() {
     UserErrorProjection<ProductDuplicateOperationProjection<PARENT, ROOT>, ROOT> projection = new UserErrorProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }

  public ProductDuplicateOperationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
