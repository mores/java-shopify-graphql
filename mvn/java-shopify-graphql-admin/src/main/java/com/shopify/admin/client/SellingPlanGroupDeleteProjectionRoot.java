package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("SellingPlanGroupDeletePayload"));
  }

  public SellingPlanGroupDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupUserErrorProjection<SellingPlanGroupDeleteProjectionRoot<PARENT, ROOT>, SellingPlanGroupDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<SellingPlanGroupDeleteProjectionRoot<PARENT, ROOT>, SellingPlanGroupDeleteProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public SellingPlanGroupDeleteProjectionRoot<PARENT, ROOT> deletedSellingPlanGroupId() {
    getFields().put("deletedSellingPlanGroupId", null);
    return this;
  }
}
