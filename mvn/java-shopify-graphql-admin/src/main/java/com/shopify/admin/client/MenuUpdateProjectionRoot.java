package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenuUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("MenuUpdatePayload"));
  }

  public MenuUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuProjection<MenuUpdateProjectionRoot<PARENT, ROOT>, MenuUpdateProjectionRoot<PARENT, ROOT>> menu(
      ) {
    MenuProjection<MenuUpdateProjectionRoot<PARENT, ROOT>, MenuUpdateProjectionRoot<PARENT, ROOT>> projection = new MenuProjection<>(this, this);    
    getFields().put("menu", projection);
    return projection;
  }

  public MenuUpdateUserErrorProjection<MenuUpdateProjectionRoot<PARENT, ROOT>, MenuUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MenuUpdateUserErrorProjection<MenuUpdateProjectionRoot<PARENT, ROOT>, MenuUpdateProjectionRoot<PARENT, ROOT>> projection = new MenuUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
