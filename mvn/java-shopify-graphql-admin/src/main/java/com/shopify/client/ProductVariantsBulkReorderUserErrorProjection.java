package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantsBulkReorderUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantsBulkReorderUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantsBulkReorderUserError"));
  }

  public ProductVariantsBulkReorderUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantsBulkReorderUserErrorCodeProjection<ProductVariantsBulkReorderUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ProductVariantsBulkReorderUserErrorCodeProjection<ProductVariantsBulkReorderUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantsBulkReorderUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductVariantsBulkReorderUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ProductVariantsBulkReorderUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
