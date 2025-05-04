package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemeRoleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeRoleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ThemeRole"));
  }

  public ThemeRoleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
