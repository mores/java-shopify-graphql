package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFeedConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFeedConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductFeedConnection"));
  }

  public ProductFeedConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductFeedEdgeProjection<ProductFeedConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ProductFeedEdgeProjection<ProductFeedConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ProductFeedProjection<ProductFeedConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ProductFeedProjection<ProductFeedConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ProductFeedConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ProductFeedConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
