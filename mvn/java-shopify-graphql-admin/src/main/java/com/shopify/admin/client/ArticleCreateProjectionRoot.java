package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ArticleCreatePayload"));
  }

  public ArticleCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleProjection<ArticleCreateProjectionRoot<PARENT, ROOT>, ArticleCreateProjectionRoot<PARENT, ROOT>> article(
      ) {
    ArticleProjection<ArticleCreateProjectionRoot<PARENT, ROOT>, ArticleCreateProjectionRoot<PARENT, ROOT>> projection = new ArticleProjection<>(this, this);    
    getFields().put("article", projection);
    return projection;
  }

  public ArticleCreateUserErrorProjection<ArticleCreateProjectionRoot<PARENT, ROOT>, ArticleCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ArticleCreateUserErrorProjection<ArticleCreateProjectionRoot<PARENT, ROOT>, ArticleCreateProjectionRoot<PARENT, ROOT>> projection = new ArticleCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
