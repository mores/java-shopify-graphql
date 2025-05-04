package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductLeaveSellingPlanGroupsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductLeaveSellingPlanGroupsProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductLeaveSellingPlanGroupsPayload"));
  }

  public ProductLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public SellingPlanGroupUserErrorProjection<ProductLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<ProductLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductLeaveSellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
