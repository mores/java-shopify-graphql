package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppConnection"));
  }

  public AppConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppEdgeProjection<AppConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     AppEdgeProjection<AppConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AppProjection<AppConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     AppProjection<AppConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AppConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<AppConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
