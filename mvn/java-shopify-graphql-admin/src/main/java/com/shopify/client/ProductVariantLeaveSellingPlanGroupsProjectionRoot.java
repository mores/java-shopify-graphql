package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantLeaveSellingPlanGroupsProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantLeaveSellingPlanGroupsPayload"));
  }

  public ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>> productVariant(
      ) {
    ProductVariantProjection<ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("productVariant", projection);
    return projection;
  }

  public SellingPlanGroupUserErrorProjection<ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductVariantLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
