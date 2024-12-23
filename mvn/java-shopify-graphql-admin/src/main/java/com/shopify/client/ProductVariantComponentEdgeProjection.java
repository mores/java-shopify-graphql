package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantComponentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantComponentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantComponentEdge"));
  }

  public ProductVariantComponentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantComponentProjection<ProductVariantComponentEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ProductVariantComponentProjection<ProductVariantComponentEdgeProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ProductVariantComponentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
