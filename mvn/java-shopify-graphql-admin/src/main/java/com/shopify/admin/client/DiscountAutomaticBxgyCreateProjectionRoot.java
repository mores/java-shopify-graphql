package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticBxgyCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticBxgyCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticBxgyCreatePayload"));
  }

  public DiscountAutomaticBxgyCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticBxgyCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBxgyCreateProjectionRoot<PARENT, ROOT>> automaticDiscountNode(
      ) {
    DiscountAutomaticNodeProjection<DiscountAutomaticBxgyCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBxgyCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeProjection<>(this, this);    
    getFields().put("automaticDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticBxgyCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBxgyCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticBxgyCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBxgyCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
