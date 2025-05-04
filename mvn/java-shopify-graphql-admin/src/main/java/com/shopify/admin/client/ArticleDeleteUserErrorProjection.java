package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleDeleteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleDeleteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ArticleDeleteUserError"));
  }

  public ArticleDeleteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleDeleteUserErrorCodeProjection<ArticleDeleteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ArticleDeleteUserErrorCodeProjection<ArticleDeleteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ArticleDeleteUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ArticleDeleteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ArticleDeleteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
