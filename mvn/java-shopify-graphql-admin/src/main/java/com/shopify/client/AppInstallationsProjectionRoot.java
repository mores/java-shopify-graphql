package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppInstallationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppInstallationsProjectionRoot() {
    super(null, null, java.util.Optional.of("AppInstallationConnection"));
  }

  public AppInstallationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppInstallationEdgeProjection<AppInstallationsProjectionRoot<PARENT, ROOT>, AppInstallationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    AppInstallationEdgeProjection<AppInstallationsProjectionRoot<PARENT, ROOT>, AppInstallationsProjectionRoot<PARENT, ROOT>> projection = new AppInstallationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public AppInstallationProjection<AppInstallationsProjectionRoot<PARENT, ROOT>, AppInstallationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    AppInstallationProjection<AppInstallationsProjectionRoot<PARENT, ROOT>, AppInstallationsProjectionRoot<PARENT, ROOT>> projection = new AppInstallationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<AppInstallationsProjectionRoot<PARENT, ROOT>, AppInstallationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<AppInstallationsProjectionRoot<PARENT, ROOT>, AppInstallationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
