package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppUninstallAppUninstallErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppUninstallAppUninstallErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppUninstallAppUninstallError"));
  }

  public AppUninstallAppUninstallErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppUninstallAppUninstallErrorCodeProjection<AppUninstallAppUninstallErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     AppUninstallAppUninstallErrorCodeProjection<AppUninstallAppUninstallErrorProjection<PARENT, ROOT>, ROOT> projection = new AppUninstallAppUninstallErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public AppUninstallAppUninstallErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public AppUninstallAppUninstallErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
