package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantJoinSellingPlanGroupsProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariantJoinSellingPlanGroupsPayload"));
  }

  public ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>> productVariant(
      ) {
    ProductVariantProjection<ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("productVariant", projection);
    return projection;
  }

  public SellingPlanGroupUserErrorProjection<ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductVariantJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
