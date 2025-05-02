package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanGroupConnection"));
  }

  public SellingPlanGroupConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupEdgeProjection<SellingPlanGroupConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SellingPlanGroupEdgeProjection<SellingPlanGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SellingPlanGroupProjection<SellingPlanGroupConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SellingPlanGroupProjection<SellingPlanGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SellingPlanGroupConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SellingPlanGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
