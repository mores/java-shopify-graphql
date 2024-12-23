package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantsBulkDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantsBulkDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantsBulkDeletePayload"));
  }

  public ProductVariantsBulkDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductVariantsBulkDeleteProjectionRoot<PARENT, ROOT>, ProductVariantsBulkDeleteProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantsBulkDeleteProjectionRoot<PARENT, ROOT>, ProductVariantsBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductVariantsBulkDeleteUserErrorProjection<ProductVariantsBulkDeleteProjectionRoot<PARENT, ROOT>, ProductVariantsBulkDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductVariantsBulkDeleteUserErrorProjection<ProductVariantsBulkDeleteProjectionRoot<PARENT, ROOT>, ProductVariantsBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new ProductVariantsBulkDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
