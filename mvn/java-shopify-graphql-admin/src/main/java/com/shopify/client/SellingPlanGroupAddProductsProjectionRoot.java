package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupAddProductsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupAddProductsProjectionRoot() {
    super(null, null, java.util.Optional.of("SellingPlanGroupAddProductsPayload"));
  }

  public SellingPlanGroupAddProductsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupProjection<SellingPlanGroupAddProductsProjectionRoot<PARENT, ROOT>, SellingPlanGroupAddProductsProjectionRoot<PARENT, ROOT>> sellingPlanGroup(
      ) {
    SellingPlanGroupProjection<SellingPlanGroupAddProductsProjectionRoot<PARENT, ROOT>, SellingPlanGroupAddProductsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupProjection<>(this, this);    
    getFields().put("sellingPlanGroup", projection);
    return projection;
  }

  public SellingPlanGroupUserErrorProjection<SellingPlanGroupAddProductsProjectionRoot<PARENT, ROOT>, SellingPlanGroupAddProductsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<SellingPlanGroupAddProductsProjectionRoot<PARENT, ROOT>, SellingPlanGroupAddProductsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
