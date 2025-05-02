package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MenuItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MenuItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MenuItem"));
  }

  public MenuItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuItemProjection<MenuItemFragmentProjection<PARENT, ROOT>, ROOT> items() {
     MenuItemProjection<MenuItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MenuItemProjection<>(this, getRoot());
     getFields().put("items", projection);
     return projection;
  }

  public MenuItemResourceProjection<MenuItemFragmentProjection<PARENT, ROOT>, ROOT> resource() {
     MenuItemResourceProjection<MenuItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MenuItemResourceProjection<>(this, getRoot());
     getFields().put("resource", projection);
     return projection;
  }

  public MenuItemTypeProjection<MenuItemFragmentProjection<PARENT, ROOT>, ROOT> type() {
     MenuItemTypeProjection<MenuItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MenuItemTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MenuItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MenuItemFragmentProjection<PARENT, ROOT> resourceId() {
    getFields().put("resourceId", null);
    return this;
  }

  public MenuItemFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public MenuItemFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public MenuItemFragmentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MenuItem {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
