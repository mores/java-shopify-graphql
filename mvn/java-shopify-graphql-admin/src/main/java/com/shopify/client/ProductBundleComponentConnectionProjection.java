package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleComponentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleComponentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleComponentConnection"));
  }

  public ProductBundleComponentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductBundleComponentEdgeProjection<ProductBundleComponentConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ProductBundleComponentEdgeProjection<ProductBundleComponentConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ProductBundleComponentProjection<ProductBundleComponentConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ProductBundleComponentProjection<ProductBundleComponentConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ProductBundleComponentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ProductBundleComponentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
