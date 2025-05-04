package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppSubscriptionConnection"));
  }

  public AppSubscriptionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionEdgeProjection<AppSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AppSubscriptionEdgeProjection<AppSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AppSubscriptionProjection<AppSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     AppSubscriptionProjection<AppSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AppSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<AppSubscriptionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
