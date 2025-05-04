package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ArticleDeletePayload"));
  }

  public ArticleDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleDeleteUserErrorProjection<ArticleDeleteProjectionRoot<PARENT, ROOT>, ArticleDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ArticleDeleteUserErrorProjection<ArticleDeleteProjectionRoot<PARENT, ROOT>, ArticleDeleteProjectionRoot<PARENT, ROOT>> projection = new ArticleDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ArticleDeleteProjectionRoot<PARENT, ROOT> deletedArticleId() {
    getFields().put("deletedArticleId", null);
    return this;
  }
}
