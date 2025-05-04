package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeAppUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeAppUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeAppUpdatePayload"));
  }

  public DiscountCodeAppUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeAppProjection<DiscountCodeAppUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeAppUpdateProjectionRoot<PARENT, ROOT>> codeAppDiscount(
      ) {
    DiscountCodeAppProjection<DiscountCodeAppUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeAppUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeAppProjection<>(this, this);    
    getFields().put("codeAppDiscount", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeAppUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeAppUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeAppUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeAppUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
