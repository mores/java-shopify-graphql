package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeAppCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeAppCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeAppCreatePayload"));
  }

  public DiscountCodeAppCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeAppProjection<DiscountCodeAppCreateProjectionRoot<PARENT, ROOT>, DiscountCodeAppCreateProjectionRoot<PARENT, ROOT>> codeAppDiscount(
      ) {
    DiscountCodeAppProjection<DiscountCodeAppCreateProjectionRoot<PARENT, ROOT>, DiscountCodeAppCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeAppProjection<>(this, this);    
    getFields().put("codeAppDiscount", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeAppCreateProjectionRoot<PARENT, ROOT>, DiscountCodeAppCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeAppCreateProjectionRoot<PARENT, ROOT>, DiscountCodeAppCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
