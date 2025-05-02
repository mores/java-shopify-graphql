package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanAllocationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanAllocationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanAllocationConnection"));
  }

  public SellingPlanAllocationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanAllocationEdgeProjection<SellingPlanAllocationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SellingPlanAllocationEdgeProjection<SellingPlanAllocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SellingPlanAllocationProjection<SellingPlanAllocationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SellingPlanAllocationProjection<SellingPlanAllocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SellingPlanAllocationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<SellingPlanAllocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
