package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemeDuplicateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemeDuplicateProjectionRoot() {
    super(null, null, java.util.Optional.of("ThemeDuplicatePayload"));
  }

  public ThemeDuplicateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeProjection<ThemeDuplicateProjectionRoot<PARENT, ROOT>, ThemeDuplicateProjectionRoot<PARENT, ROOT>> newTheme(
      ) {
    OnlineStoreThemeProjection<ThemeDuplicateProjectionRoot<PARENT, ROOT>, ThemeDuplicateProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeProjection<>(this, this);    
    getFields().put("newTheme", projection);
    return projection;
  }

  public ThemeDuplicateUserErrorProjection<ThemeDuplicateProjectionRoot<PARENT, ROOT>, ThemeDuplicateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ThemeDuplicateUserErrorProjection<ThemeDuplicateProjectionRoot<PARENT, ROOT>, ThemeDuplicateProjectionRoot<PARENT, ROOT>> projection = new ThemeDuplicateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
