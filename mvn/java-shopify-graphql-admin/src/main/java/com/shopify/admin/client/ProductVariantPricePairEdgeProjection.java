package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantPricePairEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantPricePairEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantPricePairEdge"));
  }

  public ProductVariantPricePairEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantPricePairProjection<ProductVariantPricePairEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ProductVariantPricePairProjection<ProductVariantPricePairEdgeProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ProductVariantPricePairEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
