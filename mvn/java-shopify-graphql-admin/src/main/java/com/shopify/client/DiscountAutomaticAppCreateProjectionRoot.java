package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticAppCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticAppCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticAppCreatePayload"));
  }

  public DiscountAutomaticAppCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticAppProjection<DiscountAutomaticAppCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticAppCreateProjectionRoot<PARENT, ROOT>> automaticAppDiscount(
      ) {
    DiscountAutomaticAppProjection<DiscountAutomaticAppCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticAppCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticAppProjection<>(this, this);    
    getFields().put("automaticAppDiscount", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticAppCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticAppCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticAppCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticAppCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
