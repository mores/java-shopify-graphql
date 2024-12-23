package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticFreeShippingCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticFreeShippingCreatePayload"));
  }

  public DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT, ROOT>> automaticDiscountNode(
      ) {
    DiscountAutomaticNodeProjection<DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeProjection<>(this, this);    
    getFields().put("automaticDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticFreeShippingCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
