package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppPurchaseOneTimeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppPurchaseOneTimeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppPurchaseOneTimeEdge"));
  }

  public AppPurchaseOneTimeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppPurchaseOneTimeProjection<AppPurchaseOneTimeEdgeProjection<PARENT, ROOT>, ROOT> node() {
     AppPurchaseOneTimeProjection<AppPurchaseOneTimeEdgeProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseOneTimeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AppPurchaseOneTimeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
