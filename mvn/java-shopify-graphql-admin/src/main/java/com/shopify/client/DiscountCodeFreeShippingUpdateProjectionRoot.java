package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeFreeShippingUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeFreeShippingUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeFreeShippingUpdatePayload"));
  }

  public DiscountCodeFreeShippingUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeNodeProjection<DiscountCodeFreeShippingUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeFreeShippingUpdateProjectionRoot<PARENT, ROOT>> codeDiscountNode(
      ) {
    DiscountCodeNodeProjection<DiscountCodeFreeShippingUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeFreeShippingUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeProjection<>(this, this);    
    getFields().put("codeDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeFreeShippingUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeFreeShippingUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeFreeShippingUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeFreeShippingUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
