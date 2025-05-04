package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticFreeShippingUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticFreeShippingUpdatePayload"));
  }

  public DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT, ROOT>> automaticDiscountNode(
      ) {
    DiscountAutomaticNodeProjection<DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeProjection<>(this, this);    
    getFields().put("automaticDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticFreeShippingUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
