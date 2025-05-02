package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanAllocationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanAllocationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanAllocationEdge"));
  }

  public SellingPlanAllocationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanAllocationProjection<SellingPlanAllocationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     SellingPlanAllocationProjection<SellingPlanAllocationEdgeProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SellingPlanAllocationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
