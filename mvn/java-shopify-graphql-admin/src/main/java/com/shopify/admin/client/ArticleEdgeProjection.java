package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ArticleEdge"));
  }

  public ArticleEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleProjection<ArticleEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ArticleProjection<ArticleEdgeProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ArticleEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
