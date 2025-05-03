package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenuProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuProjectionRoot() {
    super(null, null, java.util.Optional.of("Menu"));
  }

  public MenuProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuItemProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> items(
      ) {
    MenuItemProjection<MenuProjectionRoot<PARENT, ROOT>, MenuProjectionRoot<PARENT, ROOT>> projection = new MenuItemProjection<>(this, this);    
    getFields().put("items", projection);
    return projection;
  }

  public MenuProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MenuProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MenuProjectionRoot<PARENT, ROOT> itemsCount() {
    getFields().put("itemsCount", null);
    return this;
  }

  public MenuProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
