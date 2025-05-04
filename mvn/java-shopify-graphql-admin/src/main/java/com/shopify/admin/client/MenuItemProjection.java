package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenuItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MenuItem"));
  }

  public MenuItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuItemProjection<MenuItemProjection<PARENT, ROOT>, ROOT> items() {
     MenuItemProjection<MenuItemProjection<PARENT, ROOT>, ROOT> projection = new MenuItemProjection<>(this, getRoot());
     getFields().put("items", projection);
     return projection;
  }

  public MenuItemTypeProjection<MenuItemProjection<PARENT, ROOT>, ROOT> type() {
     MenuItemTypeProjection<MenuItemProjection<PARENT, ROOT>, ROOT> projection = new MenuItemTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MenuItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MenuItemProjection<PARENT, ROOT> resourceId() {
    getFields().put("resourceId", null);
    return this;
  }

  public MenuItemProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public MenuItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public MenuItemProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
