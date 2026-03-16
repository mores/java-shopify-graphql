package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppUninstallProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppUninstallProjectionRoot() {
    super(null, null, java.util.Optional.of("AppUninstallPayload"));
  }

  public AppUninstallProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<AppUninstallProjectionRoot<PARENT, ROOT>, AppUninstallProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<AppUninstallProjectionRoot<PARENT, ROOT>, AppUninstallProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public AppUninstallAppUninstallErrorProjection<AppUninstallProjectionRoot<PARENT, ROOT>, AppUninstallProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AppUninstallAppUninstallErrorProjection<AppUninstallProjectionRoot<PARENT, ROOT>, AppUninstallProjectionRoot<PARENT, ROOT>> projection = new AppUninstallAppUninstallErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
