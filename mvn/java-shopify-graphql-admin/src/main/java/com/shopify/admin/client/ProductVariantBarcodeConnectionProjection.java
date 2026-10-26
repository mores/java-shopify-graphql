package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantBarcodeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantBarcodeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantBarcodeConnection"));
  }

  public ProductVariantBarcodeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantBarcodeEdgeProjection<ProductVariantBarcodeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ProductVariantBarcodeEdgeProjection<ProductVariantBarcodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantBarcodeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ProductVariantBarcodeProjection<ProductVariantBarcodeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ProductVariantBarcodeProjection<ProductVariantBarcodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantBarcodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ProductVariantBarcodeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ProductVariantBarcodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
