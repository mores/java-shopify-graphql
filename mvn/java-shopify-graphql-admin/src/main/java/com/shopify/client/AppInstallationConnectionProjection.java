package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppInstallationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppInstallationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppInstallationConnection"));
  }

  public AppInstallationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppInstallationEdgeProjection<AppInstallationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AppInstallationEdgeProjection<AppInstallationConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AppInstallationProjection<AppInstallationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     AppInstallationProjection<AppInstallationConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AppInstallationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<AppInstallationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
