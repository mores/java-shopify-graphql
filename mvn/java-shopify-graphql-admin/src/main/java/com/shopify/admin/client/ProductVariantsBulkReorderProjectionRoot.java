package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantsBulkReorderProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantsBulkReorderProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantsBulkReorderPayload"));
  }

  public ProductVariantsBulkReorderProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductVariantsBulkReorderProjectionRoot<PARENT, ROOT>, ProductVariantsBulkReorderProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantsBulkReorderProjectionRoot<PARENT, ROOT>, ProductVariantsBulkReorderProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductVariantsBulkReorderUserErrorProjection<ProductVariantsBulkReorderProjectionRoot<PARENT, ROOT>, ProductVariantsBulkReorderProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductVariantsBulkReorderUserErrorProjection<ProductVariantsBulkReorderProjectionRoot<PARENT, ROOT>, ProductVariantsBulkReorderProjectionRoot<PARENT, ROOT>> projection = new ProductVariantsBulkReorderUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
