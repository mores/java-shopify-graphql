package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BlogsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogsProjectionRoot() {
    super(null, null, java.util.Optional.of("BlogConnection"));
  }

  public BlogsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BlogEdgeProjection<BlogsProjectionRoot<PARENT, ROOT>, BlogsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    BlogEdgeProjection<BlogsProjectionRoot<PARENT, ROOT>, BlogsProjectionRoot<PARENT, ROOT>> projection = new BlogEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public BlogProjection<BlogsProjectionRoot<PARENT, ROOT>, BlogsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    BlogProjection<BlogsProjectionRoot<PARENT, ROOT>, BlogsProjectionRoot<PARENT, ROOT>> projection = new BlogProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<BlogsProjectionRoot<PARENT, ROOT>, BlogsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<BlogsProjectionRoot<PARENT, ROOT>, BlogsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
