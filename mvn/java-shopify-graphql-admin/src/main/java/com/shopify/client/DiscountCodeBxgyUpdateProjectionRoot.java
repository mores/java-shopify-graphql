package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeBxgyUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeBxgyUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeBxgyUpdatePayload"));
  }

  public DiscountCodeBxgyUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeNodeProjection<DiscountCodeBxgyUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeBxgyUpdateProjectionRoot<PARENT, ROOT>> codeDiscountNode(
      ) {
    DiscountCodeNodeProjection<DiscountCodeBxgyUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeBxgyUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeProjection<>(this, this);    
    getFields().put("codeDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeBxgyUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeBxgyUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeBxgyUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeBxgyUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
