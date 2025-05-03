package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentConnection"));
  }

  public CommentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentEdgeProjection<CommentConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     CommentEdgeProjection<CommentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CommentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CommentProjection<CommentConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CommentProjection<CommentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CommentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CommentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CommentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
