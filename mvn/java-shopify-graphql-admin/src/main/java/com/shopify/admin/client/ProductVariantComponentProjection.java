package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantComponentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantComponentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantComponent"));
  }

  public ProductVariantComponentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductVariantComponentProjection<PARENT, ROOT>, ROOT> productVariant(
      ) {
     ProductVariantProjection<ProductVariantComponentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("productVariant", projection);
     return projection;
  }

  public ProductVariantComponentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductVariantComponentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
