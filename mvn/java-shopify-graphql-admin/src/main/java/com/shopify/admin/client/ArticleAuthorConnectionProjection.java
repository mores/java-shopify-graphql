package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleAuthorConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleAuthorConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ArticleAuthorConnection"));
  }

  public ArticleAuthorConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleAuthorEdgeProjection<ArticleAuthorConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ArticleAuthorEdgeProjection<ArticleAuthorConnectionProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ArticleAuthorProjection<ArticleAuthorConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ArticleAuthorProjection<ArticleAuthorConnectionProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ArticleAuthorConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ArticleAuthorConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
