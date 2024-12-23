package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppCreditEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppCreditEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppCreditEdge"));
  }

  public AppCreditEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppCreditProjection<AppCreditEdgeProjection<PARENT, ROOT>, ROOT> node() {
     AppCreditProjection<AppCreditEdgeProjection<PARENT, ROOT>, ROOT> projection = new AppCreditProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AppCreditEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
