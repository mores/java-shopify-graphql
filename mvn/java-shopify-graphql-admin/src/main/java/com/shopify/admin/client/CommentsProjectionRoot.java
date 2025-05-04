package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentsProjectionRoot() {
    super(null, null, java.util.Optional.of("CommentConnection"));
  }

  public CommentsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentEdgeProjection<CommentsProjectionRoot<PARENT, ROOT>, CommentsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CommentEdgeProjection<CommentsProjectionRoot<PARENT, ROOT>, CommentsProjectionRoot<PARENT, ROOT>> projection = new CommentEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CommentProjection<CommentsProjectionRoot<PARENT, ROOT>, CommentsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CommentProjection<CommentsProjectionRoot<PARENT, ROOT>, CommentsProjectionRoot<PARENT, ROOT>> projection = new CommentProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CommentsProjectionRoot<PARENT, ROOT>, CommentsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CommentsProjectionRoot<PARENT, ROOT>, CommentsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
