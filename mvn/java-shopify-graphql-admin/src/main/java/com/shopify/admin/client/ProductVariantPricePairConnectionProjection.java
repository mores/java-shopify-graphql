package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantPricePairConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantPricePairConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantPricePairConnection"));
  }

  public ProductVariantPricePairConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantPricePairEdgeProjection<ProductVariantPricePairConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ProductVariantPricePairEdgeProjection<ProductVariantPricePairConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ProductVariantPricePairProjection<ProductVariantPricePairConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ProductVariantPricePairProjection<ProductVariantPricePairConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ProductVariantPricePairConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ProductVariantPricePairConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
