package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantBarcodeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantBarcodeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantBarcodeEdge"));
  }

  public ProductVariantBarcodeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantBarcodeProjection<ProductVariantBarcodeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ProductVariantBarcodeProjection<ProductVariantBarcodeEdgeProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantBarcodeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ProductVariantBarcodeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
