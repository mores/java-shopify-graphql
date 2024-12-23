package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PageConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PageConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PageConnection"));
  }

  public PageConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PageEdgeProjection<PageConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     PageEdgeProjection<PageConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PageProjection<PageConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     PageProjection<PageConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PageConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<PageConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
