package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOptionValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOptionValue"));
  }

  public ProductOptionValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> firstSelectableVariant(
      ) {
     ProductVariantProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("firstSelectableVariant", projection);
     return projection;
  }

  public ProductOptionValueSwatchProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> swatch(
      ) {
     ProductOptionValueSwatchProjection<ProductOptionValueProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionValueSwatchProjection<>(this, getRoot());
     getFields().put("swatch", projection);
     return projection;
  }

  public ProductOptionValueProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductOptionValueProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
