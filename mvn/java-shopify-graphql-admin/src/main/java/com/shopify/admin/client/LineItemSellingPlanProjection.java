package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LineItemSellingPlanProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LineItemSellingPlanProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItemSellingPlan"));
  }

  public LineItemSellingPlanProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemSellingPlanProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public LineItemSellingPlanProjection<PARENT, ROOT> sellingPlanId() {
    getFields().put("sellingPlanId", null);
    return this;
  }
}
