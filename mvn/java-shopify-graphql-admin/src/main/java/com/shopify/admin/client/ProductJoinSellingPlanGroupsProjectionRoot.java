package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductJoinSellingPlanGroupsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductJoinSellingPlanGroupsProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductJoinSellingPlanGroupsPayload"));
  }

  public ProductJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public SellingPlanGroupUserErrorProjection<ProductJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<ProductJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>, ProductJoinSellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
