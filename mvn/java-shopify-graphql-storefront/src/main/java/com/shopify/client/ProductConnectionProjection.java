package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductConnection"));
  }

  public ProductConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductEdgeProjection<ProductConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ProductEdgeProjection<ProductConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public FilterProjection<ProductConnectionProjection<PARENT, ROOT>, ROOT> filters() {
     FilterProjection<ProductConnectionProjection<PARENT, ROOT>, ROOT> projection = new FilterProjection<>(this, getRoot());
     getFields().put("filters", projection);
     return projection;
  }

  public ProductProjection<ProductConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ProductProjection<ProductConnectionProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ProductConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ProductConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
