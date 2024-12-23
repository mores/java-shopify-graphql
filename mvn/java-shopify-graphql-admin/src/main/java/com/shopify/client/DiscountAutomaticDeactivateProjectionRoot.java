package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticDeactivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticDeactivateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticDeactivatePayload"));
  }

  public DiscountAutomaticDeactivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticDeactivateProjectionRoot<PARENT, ROOT>, DiscountAutomaticDeactivateProjectionRoot<PARENT, ROOT>> automaticDiscountNode(
      ) {
    DiscountAutomaticNodeProjection<DiscountAutomaticDeactivateProjectionRoot<PARENT, ROOT>, DiscountAutomaticDeactivateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeProjection<>(this, this);    
    getFields().put("automaticDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticDeactivateProjectionRoot<PARENT, ROOT>, DiscountAutomaticDeactivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticDeactivateProjectionRoot<PARENT, ROOT>, DiscountAutomaticDeactivateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
