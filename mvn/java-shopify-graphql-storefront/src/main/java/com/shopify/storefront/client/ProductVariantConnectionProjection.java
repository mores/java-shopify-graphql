package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantConnection"));
  }

  public ProductVariantConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantEdgeProjection<ProductVariantConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ProductVariantEdgeProjection<ProductVariantConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ProductVariantProjection<ProductVariantConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ProductVariantProjection<ProductVariantConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ProductVariantConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ProductVariantConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
