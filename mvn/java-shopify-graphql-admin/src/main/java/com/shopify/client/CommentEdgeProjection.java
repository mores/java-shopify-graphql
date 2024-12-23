package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentEdge"));
  }

  public CommentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentProjection<CommentEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CommentProjection<CommentEdgeProjection<PARENT, ROOT>, ROOT> projection = new CommentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CommentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
