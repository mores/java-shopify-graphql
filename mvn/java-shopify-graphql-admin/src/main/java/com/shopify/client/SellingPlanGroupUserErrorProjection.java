package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanGroupUserError"));
  }

  public SellingPlanGroupUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupUserErrorCodeProjection<SellingPlanGroupUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SellingPlanGroupUserErrorCodeProjection<SellingPlanGroupUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SellingPlanGroupUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SellingPlanGroupUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
