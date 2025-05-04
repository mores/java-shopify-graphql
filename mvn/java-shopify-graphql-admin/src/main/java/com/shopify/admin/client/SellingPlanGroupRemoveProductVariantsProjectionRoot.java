package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupRemoveProductVariantsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupRemoveProductVariantsProjectionRoot() {
    super(null, null, java.util.Optional.of("SellingPlanGroupRemoveProductVariantsPayload"));
  }

  public SellingPlanGroupRemoveProductVariantsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupUserErrorProjection<SellingPlanGroupRemoveProductVariantsProjectionRoot<PARENT, ROOT>, SellingPlanGroupRemoveProductVariantsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<SellingPlanGroupRemoveProductVariantsProjectionRoot<PARENT, ROOT>, SellingPlanGroupRemoveProductVariantsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public SellingPlanGroupRemoveProductVariantsProjectionRoot<PARENT, ROOT> removedProductVariantIds(
      ) {
    getFields().put("removedProductVariantIds", null);
    return this;
  }
}
