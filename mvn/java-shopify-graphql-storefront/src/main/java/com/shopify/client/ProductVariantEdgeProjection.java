package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantEdge"));
  }

  public ProductVariantEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductVariantEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ProductVariantProjection<ProductVariantEdgeProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ProductVariantEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
