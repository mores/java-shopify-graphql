package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantsBulkUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantsBulkUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantsBulkUpdatePayload"));
  }

  public ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductVariantProjection<ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>> productVariants(
      ) {
    ProductVariantProjection<ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("productVariants", projection);
    return projection;
  }

  public ProductVariantsBulkUpdateUserErrorProjection<ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductVariantsBulkUpdateUserErrorProjection<ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkUpdateProjectionRoot<PARENT, ROOT>> projection = new ProductVariantsBulkUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
