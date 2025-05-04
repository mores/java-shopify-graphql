package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOperationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOperationProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductOperation"));
  }

  public ProductOperationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductOperationStatusProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> status(
      ) {
    ProductOperationStatusProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> projection = new ProductOperationStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public ProductBundleOperationFragmentProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> onProductBundleOperation(
      ) {
    ProductBundleOperationFragmentProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> fragment = new ProductBundleOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDeleteOperationFragmentProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> onProductDeleteOperation(
      ) {
    ProductDeleteOperationFragmentProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> fragment = new ProductDeleteOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDuplicateOperationFragmentProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> onProductDuplicateOperation(
      ) {
    ProductDuplicateOperationFragmentProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> fragment = new ProductDuplicateOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductSetOperationFragmentProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> onProductSetOperation(
      ) {
    ProductSetOperationFragmentProjection<ProductOperationProjectionRoot<PARENT, ROOT>, ProductOperationProjectionRoot<PARENT, ROOT>> fragment = new ProductSetOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
