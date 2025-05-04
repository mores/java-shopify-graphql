package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenuDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MenuDeletePayload"));
  }

  public MenuDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuDeleteUserErrorProjection<MenuDeleteProjectionRoot<PARENT, ROOT>, MenuDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MenuDeleteUserErrorProjection<MenuDeleteProjectionRoot<PARENT, ROOT>, MenuDeleteProjectionRoot<PARENT, ROOT>> projection = new MenuDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MenuDeleteProjectionRoot<PARENT, ROOT> deletedMenuId() {
    getFields().put("deletedMenuId", null);
    return this;
  }
}
