package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppInstallationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppInstallationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppInstallationEdge"));
  }

  public AppInstallationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppInstallationProjection<AppInstallationEdgeProjection<PARENT, ROOT>, ROOT> node() {
     AppInstallationProjection<AppInstallationEdgeProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AppInstallationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
