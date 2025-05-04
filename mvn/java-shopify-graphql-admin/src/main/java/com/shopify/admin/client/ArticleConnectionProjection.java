package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ArticleConnection"));
  }

  public ArticleConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleEdgeProjection<ArticleConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ArticleEdgeProjection<ArticleConnectionProjection<PARENT, ROOT>, ROOT> projection = new ArticleEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ArticleProjection<ArticleConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ArticleProjection<ArticleConnectionProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ArticleConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ArticleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
