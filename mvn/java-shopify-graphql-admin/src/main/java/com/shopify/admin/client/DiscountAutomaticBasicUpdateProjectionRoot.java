package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticBasicUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticBasicUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticBasicUpdatePayload"));
  }

  public DiscountAutomaticBasicUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticBasicUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBasicUpdateProjectionRoot<PARENT, ROOT>> automaticDiscountNode(
      ) {
    DiscountAutomaticNodeProjection<DiscountAutomaticBasicUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBasicUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeProjection<>(this, this);    
    getFields().put("automaticDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticBasicUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBasicUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticBasicUpdateProjectionRoot<PARENT, ROOT>, DiscountAutomaticBasicUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
