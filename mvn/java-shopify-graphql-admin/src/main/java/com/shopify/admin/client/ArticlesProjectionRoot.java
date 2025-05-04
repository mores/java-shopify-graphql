package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticlesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticlesProjectionRoot() {
    super(null, null, java.util.Optional.of("ArticleConnection"));
  }

  public ArticlesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleEdgeProjection<ArticlesProjectionRoot<PARENT, ROOT>, ArticlesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ArticleEdgeProjection<ArticlesProjectionRoot<PARENT, ROOT>, ArticlesProjectionRoot<PARENT, ROOT>> projection = new ArticleEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ArticleProjection<ArticlesProjectionRoot<PARENT, ROOT>, ArticlesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ArticleProjection<ArticlesProjectionRoot<PARENT, ROOT>, ArticlesProjectionRoot<PARENT, ROOT>> projection = new ArticleProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ArticlesProjectionRoot<PARENT, ROOT>, ArticlesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ArticlesProjectionRoot<PARENT, ROOT>, ArticlesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
