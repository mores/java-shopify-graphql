package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantsBulkCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantsBulkCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantsBulkCreatePayload"));
  }

  public ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductVariantProjection<ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>> productVariants(
      ) {
    ProductVariantProjection<ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("productVariants", projection);
    return projection;
  }

  public ProductVariantsBulkCreateUserErrorProjection<ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductVariantsBulkCreateUserErrorProjection<ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>, ProductVariantsBulkCreateProjectionRoot<PARENT, ROOT>> projection = new ProductVariantsBulkCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
