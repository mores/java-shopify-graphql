package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOperationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOperationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOperation"));
  }

  public ProductOperationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductOperationStatusProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> status() {
     ProductOperationStatusProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ProductBundleOperationFragmentProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> onProductBundleOperation(
      ) {
    ProductBundleOperationFragmentProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> fragment = new ProductBundleOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDeleteOperationFragmentProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> onProductDeleteOperation(
      ) {
    ProductDeleteOperationFragmentProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> fragment = new ProductDeleteOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDuplicateOperationFragmentProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> onProductDuplicateOperation(
      ) {
    ProductDuplicateOperationFragmentProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> fragment = new ProductDuplicateOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductSetOperationFragmentProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> onProductSetOperation(
      ) {
    ProductSetOperationFragmentProjection<ProductOperationProjection<PARENT, ROOT>, ROOT> fragment = new ProductSetOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
