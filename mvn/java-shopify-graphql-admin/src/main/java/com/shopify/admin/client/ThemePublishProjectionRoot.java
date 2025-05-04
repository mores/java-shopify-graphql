package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ThemePublishProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ThemePublishProjectionRoot() {
    super(null, null, java.util.Optional.of("ThemePublishPayload"));
  }

  public ThemePublishProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeProjection<ThemePublishProjectionRoot<PARENT, ROOT>, ThemePublishProjectionRoot<PARENT, ROOT>> theme(
      ) {
    OnlineStoreThemeProjection<ThemePublishProjectionRoot<PARENT, ROOT>, ThemePublishProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeProjection<>(this, this);    
    getFields().put("theme", projection);
    return projection;
  }

  public ThemePublishUserErrorProjection<ThemePublishProjectionRoot<PARENT, ROOT>, ThemePublishProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ThemePublishUserErrorProjection<ThemePublishProjectionRoot<PARENT, ROOT>, ThemePublishProjectionRoot<PARENT, ROOT>> projection = new ThemePublishUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
