package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeFreeShippingCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeFreeShippingCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeFreeShippingCreatePayload"));
  }

  public DiscountCodeFreeShippingCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeNodeProjection<DiscountCodeFreeShippingCreateProjectionRoot<PARENT, ROOT>, DiscountCodeFreeShippingCreateProjectionRoot<PARENT, ROOT>> codeDiscountNode(
      ) {
    DiscountCodeNodeProjection<DiscountCodeFreeShippingCreateProjectionRoot<PARENT, ROOT>, DiscountCodeFreeShippingCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeProjection<>(this, this);    
    getFields().put("codeDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeFreeShippingCreateProjectionRoot<PARENT, ROOT>, DiscountCodeFreeShippingCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeFreeShippingCreateProjectionRoot<PARENT, ROOT>, DiscountCodeFreeShippingCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
