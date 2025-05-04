package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeBasicUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeBasicUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeBasicUpdatePayload"));
  }

  public DiscountCodeBasicUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeNodeProjection<DiscountCodeBasicUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeBasicUpdateProjectionRoot<PARENT, ROOT>> codeDiscountNode(
      ) {
    DiscountCodeNodeProjection<DiscountCodeBasicUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeBasicUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeProjection<>(this, this);    
    getFields().put("codeDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeBasicUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeBasicUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeBasicUpdateProjectionRoot<PARENT, ROOT>, DiscountCodeBasicUpdateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
