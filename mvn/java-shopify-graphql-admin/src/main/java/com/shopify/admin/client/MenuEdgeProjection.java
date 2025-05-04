package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenuEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MenuEdge"));
  }

  public MenuEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MenuProjection<MenuEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MenuProjection<MenuEdgeProjection<PARENT, ROOT>, ROOT> projection = new MenuProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MenuEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
