package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeDeactivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeDeactivateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeDeactivatePayload"));
  }

  public DiscountCodeDeactivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeNodeProjection<DiscountCodeDeactivateProjectionRoot<PARENT, ROOT>, DiscountCodeDeactivateProjectionRoot<PARENT, ROOT>> codeDiscountNode(
      ) {
    DiscountCodeNodeProjection<DiscountCodeDeactivateProjectionRoot<PARENT, ROOT>, DiscountCodeDeactivateProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeProjection<>(this, this);    
    getFields().put("codeDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeDeactivateProjectionRoot<PARENT, ROOT>, DiscountCodeDeactivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeDeactivateProjectionRoot<PARENT, ROOT>, DiscountCodeDeactivateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
