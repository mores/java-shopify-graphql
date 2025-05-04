package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantDetachMediaProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantDetachMediaProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantDetachMediaPayload"));
  }

  public ProductVariantDetachMediaProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>, ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>, ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductVariantProjection<ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>, ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>> productVariants(
      ) {
    ProductVariantProjection<ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>, ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("productVariants", projection);
    return projection;
  }

  public MediaUserErrorProjection<ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>, ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MediaUserErrorProjection<ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>, ProductVariantDetachMediaProjectionRoot<PARENT, ROOT>> projection = new MediaUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
