package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashDrawerFindOrCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashDrawerFindOrCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashDrawerFindOrCreateUserError"));
  }

  public CashDrawerFindOrCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashDrawerFindOrCreateUserErrorCodeProjection<CashDrawerFindOrCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CashDrawerFindOrCreateUserErrorCodeProjection<CashDrawerFindOrCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CashDrawerFindOrCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CashDrawerFindOrCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CashDrawerFindOrCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
