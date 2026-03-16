package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductComponentTypeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductComponentTypeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductComponentTypeConnection"));
  }

  public ProductComponentTypeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductComponentTypeEdgeProjection<ProductComponentTypeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ProductComponentTypeEdgeProjection<ProductComponentTypeConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductComponentTypeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ProductComponentTypeProjection<ProductComponentTypeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ProductComponentTypeProjection<ProductComponentTypeConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductComponentTypeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ProductComponentTypeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ProductComponentTypeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
