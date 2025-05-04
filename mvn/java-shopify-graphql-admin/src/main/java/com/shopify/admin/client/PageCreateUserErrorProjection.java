package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PageCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PageCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PageCreateUserError"));
  }

  public PageCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PageCreateUserErrorCodeProjection<PageCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PageCreateUserErrorCodeProjection<PageCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PageCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PageCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PageCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
