package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleOperationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleOperationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleOperation"));
  }

  public ProductBundleOperationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductBundleOperationProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductBundleOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductOperationStatusProjection<ProductBundleOperationProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ProductOperationStatusProjection<ProductBundleOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ProductBundleMutationUserErrorProjection<ProductBundleOperationProjection<PARENT, ROOT>, ROOT> userErrors(
      ) {
     ProductBundleMutationUserErrorProjection<ProductBundleOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleMutationUserErrorProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }

  public ProductBundleOperationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
