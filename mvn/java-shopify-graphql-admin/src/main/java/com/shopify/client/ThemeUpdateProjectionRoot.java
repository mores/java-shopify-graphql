package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemeUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ThemeUpdatePayload"));
  }

  public ThemeUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeProjection<ThemeUpdateProjectionRoot<PARENT, ROOT>, ThemeUpdateProjectionRoot<PARENT, ROOT>> theme(
      ) {
    OnlineStoreThemeProjection<ThemeUpdateProjectionRoot<PARENT, ROOT>, ThemeUpdateProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeProjection<>(this, this);    
    getFields().put("theme", projection);
    return projection;
  }

  public ThemeUpdateUserErrorProjection<ThemeUpdateProjectionRoot<PARENT, ROOT>, ThemeUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ThemeUpdateUserErrorProjection<ThemeUpdateProjectionRoot<PARENT, ROOT>, ThemeUpdateProjectionRoot<PARENT, ROOT>> projection = new ThemeUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
