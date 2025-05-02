package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanGroupEdge"));
  }

  public SellingPlanGroupEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupProjection<SellingPlanGroupEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SellingPlanGroupProjection<SellingPlanGroupEdgeProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SellingPlanGroupEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
