package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantAppendMediaProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantAppendMediaProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantAppendMediaPayload"));
  }

  public ProductVariantAppendMediaProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>, ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>, ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductVariantProjection<ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>, ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>> productVariants(
      ) {
    ProductVariantProjection<ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>, ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("productVariants", projection);
    return projection;
  }

  public MediaUserErrorProjection<ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>, ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MediaUserErrorProjection<ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>, ProductVariantAppendMediaProjectionRoot<PARENT, ROOT>> projection = new MediaUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
