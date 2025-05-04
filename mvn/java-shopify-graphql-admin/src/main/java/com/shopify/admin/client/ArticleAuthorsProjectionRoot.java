package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleAuthorsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleAuthorsProjectionRoot() {
    super(null, null, java.util.Optional.of("ArticleAuthorConnection"));
  }

  public ArticleAuthorsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleAuthorEdgeProjection<ArticleAuthorsProjectionRoot<PARENT, ROOT>, ArticleAuthorsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ArticleAuthorEdgeProjection<ArticleAuthorsProjectionRoot<PARENT, ROOT>, ArticleAuthorsProjectionRoot<PARENT, ROOT>> projection = new ArticleAuthorEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ArticleAuthorProjection<ArticleAuthorsProjectionRoot<PARENT, ROOT>, ArticleAuthorsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ArticleAuthorProjection<ArticleAuthorsProjectionRoot<PARENT, ROOT>, ArticleAuthorsProjectionRoot<PARENT, ROOT>> projection = new ArticleAuthorProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ArticleAuthorsProjectionRoot<PARENT, ROOT>, ArticleAuthorsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ArticleAuthorsProjectionRoot<PARENT, ROOT>, ArticleAuthorsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
