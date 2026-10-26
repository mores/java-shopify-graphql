package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PreviewInstallProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PreviewInstallProjectionRoot() {
    super(null, null, java.util.Optional.of("PreviewInstallPayload"));
  }

  public PreviewInstallProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeProjection<PreviewInstallProjectionRoot<PARENT, ROOT>, PreviewInstallProjectionRoot<PARENT, ROOT>> newTheme(
      ) {
    OnlineStoreThemeProjection<PreviewInstallProjectionRoot<PARENT, ROOT>, PreviewInstallProjectionRoot<PARENT, ROOT>> projection = new OnlineStoreThemeProjection<>(this, this);    
    getFields().put("newTheme", projection);
    return projection;
  }

  public PreviewInstallUserErrorProjection<PreviewInstallProjectionRoot<PARENT, ROOT>, PreviewInstallProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PreviewInstallUserErrorProjection<PreviewInstallProjectionRoot<PARENT, ROOT>, PreviewInstallProjectionRoot<PARENT, ROOT>> projection = new PreviewInstallUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
