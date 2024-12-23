package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemeCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ThemeCreatePayload"));
  }

  public ThemeCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeProjection<ThemeCreateProjectionRoot<PARENT, ROOT>, ThemeCreateProjectionRoot<PARENT, ROOT>> theme(
      ) {
    OnlineStoreThemeProjection<ThemeCreateProjectionRoot<PARENT, ROOT>, ThemeCreateProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeProjection<>(this, this);    
    getFields().put("theme", projection);
    return projection;
  }

  public ThemeCreateUserErrorProjection<ThemeCreateProjectionRoot<PARENT, ROOT>, ThemeCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ThemeCreateUserErrorProjection<ThemeCreateProjectionRoot<PARENT, ROOT>, ThemeCreateProjectionRoot<PARENT, ROOT>> projection = new ThemeCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
