package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppPurchaseOneTimeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppPurchaseOneTimeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppPurchaseOneTimeConnection"));
  }

  public AppPurchaseOneTimeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppPurchaseOneTimeEdgeProjection<AppPurchaseOneTimeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AppPurchaseOneTimeEdgeProjection<AppPurchaseOneTimeConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseOneTimeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AppPurchaseOneTimeProjection<AppPurchaseOneTimeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     AppPurchaseOneTimeProjection<AppPurchaseOneTimeConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseOneTimeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AppPurchaseOneTimeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<AppPurchaseOneTimeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
