package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupAddProductVariantsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupAddProductVariantsProjectionRoot() {
    super(null, null, java.util.Optional.of("SellingPlanGroupAddProductVariantsPayload"));
  }

  public SellingPlanGroupAddProductVariantsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupProjection<SellingPlanGroupAddProductVariantsProjectionRoot<PARENT, ROOT>, SellingPlanGroupAddProductVariantsProjectionRoot<PARENT, ROOT>> sellingPlanGroup(
      ) {
    SellingPlanGroupProjection<SellingPlanGroupAddProductVariantsProjectionRoot<PARENT, ROOT>, SellingPlanGroupAddProductVariantsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupProjection<>(this, this);    
    getFields().put("sellingPlanGroup", projection);
    return projection;
  }

  public SellingPlanGroupUserErrorProjection<SellingPlanGroupAddProductVariantsProjectionRoot<PARENT, ROOT>, SellingPlanGroupAddProductVariantsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<SellingPlanGroupAddProductVariantsProjectionRoot<PARENT, ROOT>, SellingPlanGroupAddProductVariantsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
