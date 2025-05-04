package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("SellingPlanGroupCreatePayload"));
  }

  public SellingPlanGroupCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupProjection<SellingPlanGroupCreateProjectionRoot<PARENT, ROOT>, SellingPlanGroupCreateProjectionRoot<PARENT, ROOT>> sellingPlanGroup(
      ) {
    SellingPlanGroupProjection<SellingPlanGroupCreateProjectionRoot<PARENT, ROOT>, SellingPlanGroupCreateProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupProjection<>(this, this);    
    getFields().put("sellingPlanGroup", projection);
    return projection;
  }

  public SellingPlanGroupUserErrorProjection<SellingPlanGroupCreateProjectionRoot<PARENT, ROOT>, SellingPlanGroupCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<SellingPlanGroupCreateProjectionRoot<PARENT, ROOT>, SellingPlanGroupCreateProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
