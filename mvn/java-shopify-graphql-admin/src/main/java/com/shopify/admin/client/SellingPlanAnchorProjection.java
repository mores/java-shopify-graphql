package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanAnchorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanAnchorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanAnchor"));
  }

  public SellingPlanAnchorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanAnchorTypeProjection<SellingPlanAnchorProjection<PARENT, ROOT>, ROOT> type() {
     SellingPlanAnchorTypeProjection<SellingPlanAnchorProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAnchorTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public SellingPlanAnchorProjection<PARENT, ROOT> cutoffDay() {
    getFields().put("cutoffDay", null);
    return this;
  }

  public SellingPlanAnchorProjection<PARENT, ROOT> day() {
    getFields().put("day", null);
    return this;
  }

  public SellingPlanAnchorProjection<PARENT, ROOT> month() {
    getFields().put("month", null);
    return this;
  }
}
