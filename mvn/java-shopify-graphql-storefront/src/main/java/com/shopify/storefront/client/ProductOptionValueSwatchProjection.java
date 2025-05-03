package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOptionValueSwatchProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionValueSwatchProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOptionValueSwatch"));
  }

  public ProductOptionValueSwatchProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaProjection<ProductOptionValueSwatchProjection<PARENT, ROOT>, ROOT> image() {
     MediaProjection<ProductOptionValueSwatchProjection<PARENT, ROOT>, ROOT> projection = new MediaProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public ProductOptionValueSwatchProjection<PARENT, ROOT> color() {
    getFields().put("color", null);
    return this;
  }
}
