package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticleAuthorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleAuthorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ArticleAuthor"));
  }

  public ArticleAuthorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleAuthorProjection<PARENT, ROOT> bio() {
    getFields().put("bio", null);
    return this;
  }

  public ArticleAuthorProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public ArticleAuthorProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public ArticleAuthorProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public ArticleAuthorProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
