package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantBarcodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantBarcodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantBarcode"));
  }

  public ProductVariantBarcodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BarcodeTypeProjection<ProductVariantBarcodeProjection<PARENT, ROOT>, ROOT> type() {
     BarcodeTypeProjection<ProductVariantBarcodeProjection<PARENT, ROOT>, ROOT> projection = new BarcodeTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ProductVariantBarcodeProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
