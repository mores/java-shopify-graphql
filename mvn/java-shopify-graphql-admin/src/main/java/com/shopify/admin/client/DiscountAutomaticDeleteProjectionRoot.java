package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticDeletePayload"));
  }

  public DiscountAutomaticDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountUserErrorProjection<DiscountAutomaticDeleteProjectionRoot<PARENT, ROOT>, DiscountAutomaticDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticDeleteProjectionRoot<PARENT, ROOT>, DiscountAutomaticDeleteProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public DiscountAutomaticDeleteProjectionRoot<PARENT, ROOT> deletedAutomaticDiscountId() {
    getFields().put("deletedAutomaticDiscountId", null);
    return this;
  }
}
