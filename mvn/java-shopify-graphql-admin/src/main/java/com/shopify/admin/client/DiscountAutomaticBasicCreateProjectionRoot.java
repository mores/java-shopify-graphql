package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticBasicCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticBasicCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticBasicCreatePayload"));
  }

  public DiscountAutomaticBasicCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticBasicCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBasicCreateProjectionRoot<PARENT, ROOT>> automaticDiscountNode(
      ) {
    DiscountAutomaticNodeProjection<DiscountAutomaticBasicCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBasicCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeProjection<>(this, this);    
    getFields().put("automaticDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticBasicCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBasicCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticBasicCreateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBasicCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
