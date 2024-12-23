package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ArticleUpdatePayload"));
  }

  public ArticleUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleProjection<ArticleUpdateProjectionRoot<PARENT, ROOT>, ArticleUpdateProjectionRoot<PARENT, ROOT>> article(
      ) {
    ArticleProjection<ArticleUpdateProjectionRoot<PARENT, ROOT>, ArticleUpdateProjectionRoot<PARENT, ROOT>> projection = new ArticleProjection<>(this, this);    
    getFields().put("article", projection);
    return projection;
  }

  public ArticleUpdateUserErrorProjection<ArticleUpdateProjectionRoot<PARENT, ROOT>, ArticleUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ArticleUpdateUserErrorProjection<ArticleUpdateProjectionRoot<PARENT, ROOT>, ArticleUpdateProjectionRoot<PARENT, ROOT>> projection = new ArticleUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
