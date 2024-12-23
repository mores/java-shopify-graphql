package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonedCheckoutConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckoutConnection"));
  }

  public AbandonedCheckoutConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutEdgeProjection<AbandonedCheckoutConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AbandonedCheckoutEdgeProjection<AbandonedCheckoutConnectionProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AbandonedCheckoutProjection<AbandonedCheckoutConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     AbandonedCheckoutProjection<AbandonedCheckoutConnectionProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AbandonedCheckoutConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<AbandonedCheckoutConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
