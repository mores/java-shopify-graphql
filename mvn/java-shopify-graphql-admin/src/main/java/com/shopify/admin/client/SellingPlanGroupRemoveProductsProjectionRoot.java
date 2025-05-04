package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupRemoveProductsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupRemoveProductsProjectionRoot() {
    super(null, null, java.util.Optional.of("SellingPlanGroupRemoveProductsPayload"));
  }

  public SellingPlanGroupRemoveProductsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupUserErrorProjection<SellingPlanGroupRemoveProductsProjectionRoot<PARENT, ROOT>, SellingPlanGroupRemoveProductsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<SellingPlanGroupRemoveProductsProjectionRoot<PARENT, ROOT>, SellingPlanGroupRemoveProductsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public SellingPlanGroupRemoveProductsProjectionRoot<PARENT, ROOT> removedProductIds() {
    getFields().put("removedProductIds", null);
    return this;
  }
}
