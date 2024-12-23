package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BlogEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BlogEdge"));
  }

  public BlogEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BlogProjection<BlogEdgeProjection<PARENT, ROOT>, ROOT> node() {
     BlogProjection<BlogEdgeProjection<PARENT, ROOT>, ROOT> projection = new BlogProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public BlogEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
