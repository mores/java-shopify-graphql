package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticAppUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticAppUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticAppUpdatePayload"));
  }

  public DiscountAutomaticAppUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticAppProjection<DiscountAutomaticAppUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticAppUpdateProjectionRoot<PARENT, ROOT>> automaticAppDiscount(
      ) {
    DiscountAutomaticAppProjection<DiscountAutomaticAppUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticAppUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticAppProjection<>(this, this);    
    getFields().put("automaticAppDiscount", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticAppUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticAppUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticAppUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticAppUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
