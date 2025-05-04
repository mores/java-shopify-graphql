package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanConnection"));
  }

  public SellingPlanConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanEdgeProjection<SellingPlanConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     SellingPlanEdgeProjection<SellingPlanConnectionProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SellingPlanProjection<SellingPlanConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     SellingPlanProjection<SellingPlanConnectionProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SellingPlanConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SellingPlanConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
