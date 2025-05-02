package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanEdge"));
  }

  public SellingPlanEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanProjection<SellingPlanEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SellingPlanProjection<SellingPlanEdgeProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SellingPlanEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
