package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenusProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenusProjectionRoot() {
    super(null, null, java.util.Optional.of("MenuConnection"));
  }

  public MenusProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuEdgeProjection<MenusProjectionRoot<PARENT, ROOT>, MenusProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MenuEdgeProjection<MenusProjectionRoot<PARENT, ROOT>, MenusProjectionRoot<PARENT, ROOT>> projection = new MenuEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MenuProjection<MenusProjectionRoot<PARENT, ROOT>, MenusProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MenuProjection<MenusProjectionRoot<PARENT, ROOT>, MenusProjectionRoot<PARENT, ROOT>> projection = new MenuProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MenusProjectionRoot<PARENT, ROOT>, MenusProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MenusProjectionRoot<PARENT, ROOT>, MenusProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
