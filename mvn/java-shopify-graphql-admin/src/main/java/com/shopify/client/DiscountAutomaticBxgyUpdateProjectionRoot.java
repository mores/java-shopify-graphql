package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticBxgyUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticBxgyUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticBxgyUpdatePayload"));
  }

  public DiscountAutomaticBxgyUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticBxgyUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBxgyUpdateProjectionRoot<PARENT, ROOT>> automaticDiscountNode(
      ) {
    DiscountAutomaticNodeProjection<DiscountAutomaticBxgyUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBxgyUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeProjection<>(this, this);    
    getFields().put("automaticDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticBxgyUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBxgyUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticBxgyUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBxgyUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
