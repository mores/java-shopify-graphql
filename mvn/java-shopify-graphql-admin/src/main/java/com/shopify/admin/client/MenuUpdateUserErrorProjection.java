package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenuUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MenuUpdateUserError"));
  }

  public MenuUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuUpdateUserErrorCodeProjection<MenuUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MenuUpdateUserErrorCodeProjection<MenuUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MenuUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MenuUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MenuUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
