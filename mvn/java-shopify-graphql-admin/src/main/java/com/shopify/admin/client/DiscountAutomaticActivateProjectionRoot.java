package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticActivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticActivateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticActivatePayload"));
  }

  public DiscountAutomaticActivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticActivateProjectionRoot<PARENT, ROOT>, DiscountAutomaticActivateProjectionRoot<PARENT, ROOT>> automaticDiscountNode(
      ) {
    DiscountAutomaticNodeProjection<DiscountAutomaticActivateProjectionRoot<PARENT, ROOT>, DiscountAutomaticActivateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeProjection<>(this, this);    
    getFields().put("automaticDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticActivateProjectionRoot<PARENT, ROOT>, DiscountAutomaticActivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticActivateProjectionRoot<PARENT, ROOT>, DiscountAutomaticActivateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
