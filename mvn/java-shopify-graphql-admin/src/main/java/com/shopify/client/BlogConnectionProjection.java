package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BlogConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BlogConnection"));
  }

  public BlogConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BlogEdgeProjection<BlogConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     BlogEdgeProjection<BlogConnectionProjection<PARENT, ROOT>, ROOT> projection = new BlogEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public BlogProjection<BlogConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     BlogProjection<BlogConnectionProjection<PARENT, ROOT>, ROOT> projection = new BlogProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<BlogConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<BlogConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
