package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenuConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MenuConnection"));
  }

  public MenuConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuEdgeProjection<MenuConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     MenuEdgeProjection<MenuConnectionProjection<PARENT, ROOT>, ROOT> projection = new MenuEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MenuProjection<MenuConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     MenuProjection<MenuConnectionProjection<PARENT, ROOT>, ROOT> projection = new MenuProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MenuConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MenuConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
