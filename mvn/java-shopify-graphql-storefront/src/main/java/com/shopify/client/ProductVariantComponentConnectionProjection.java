package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantComponentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantComponentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantComponentConnection"));
  }

  public ProductVariantComponentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantComponentEdgeProjection<ProductVariantComponentConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ProductVariantComponentEdgeProjection<ProductVariantComponentConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ProductVariantComponentProjection<ProductVariantComponentConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ProductVariantComponentProjection<ProductVariantComponentConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ProductVariantComponentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ProductVariantComponentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
