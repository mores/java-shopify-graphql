package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class NavigationItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public NavigationItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("NavigationItem"));
  }

  public NavigationItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public NavigationItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public NavigationItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public NavigationItemProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
