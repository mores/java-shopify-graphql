package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeDeletePayload"));
  }

  public DiscountCodeDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountUserErrorProjection<DiscountCodeDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeDeleteProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public DiscountCodeDeleteProjectionRoot<PARENT, ROOT> deletedCodeDiscountId() {
    getFields().put("deletedCodeDiscountId", null);
    return this;
  }
}
