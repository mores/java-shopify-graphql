package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanCategoryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanCategoryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanCategory"));
  }

  public SellingPlanCategoryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
