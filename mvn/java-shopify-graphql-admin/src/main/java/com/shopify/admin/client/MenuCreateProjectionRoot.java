package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenuCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MenuCreatePayload"));
  }

  public MenuCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuProjection<MenuCreateProjectionRoot<PARENT, ROOT>, MenuCreateProjectionRoot<PARENT, ROOT>> menu(
      ) {
    MenuProjection<MenuCreateProjectionRoot<PARENT, ROOT>, MenuCreateProjectionRoot<PARENT, ROOT>> projection = new MenuProjection<>(this, this);    
    getFields().put("menu", projection);
    return projection;
  }

  public MenuCreateUserErrorProjection<MenuCreateProjectionRoot<PARENT, ROOT>, MenuCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MenuCreateUserErrorProjection<MenuCreateProjectionRoot<PARENT, ROOT>, MenuCreateProjectionRoot<PARENT, ROOT>> projection = new MenuCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
