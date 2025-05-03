package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentAuthorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentAuthorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentAuthor"));
  }

  public CommentAuthorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentAuthorProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public CommentAuthorProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
