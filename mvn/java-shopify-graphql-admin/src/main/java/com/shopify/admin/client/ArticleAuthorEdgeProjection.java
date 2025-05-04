package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleAuthorEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleAuthorEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ArticleAuthorEdge"));
  }

  public ArticleAuthorEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleAuthorProjection<ArticleAuthorEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ArticleAuthorProjection<ArticleAuthorEdgeProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ArticleAuthorEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
