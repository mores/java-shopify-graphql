package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantsBulkCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantsBulkCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantsBulkCreateUserError"));
  }

  public ProductVariantsBulkCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantsBulkCreateUserErrorCodeProjection<ProductVariantsBulkCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ProductVariantsBulkCreateUserErrorCodeProjection<ProductVariantsBulkCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantsBulkCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductVariantsBulkCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ProductVariantsBulkCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
