package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemeDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ThemeDeletePayload"));
  }

  public ThemeDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ThemeDeleteUserErrorProjection<ThemeDeleteProjectionRoot<PARENT, ROOT>, ThemeDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ThemeDeleteUserErrorProjection<ThemeDeleteProjectionRoot<PARENT, ROOT>, ThemeDeleteProjectionRoot<PARENT, ROOT>> projection = new ThemeDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ThemeDeleteProjectionRoot<PARENT, ROOT> deletedThemeId() {
    getFields().put("deletedThemeId", null);
    return this;
  }
}
