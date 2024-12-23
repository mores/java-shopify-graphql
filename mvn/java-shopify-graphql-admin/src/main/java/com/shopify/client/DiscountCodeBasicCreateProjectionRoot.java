package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeBasicCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeBasicCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeBasicCreatePayload"));
  }

  public DiscountCodeBasicCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeNodeProjection<DiscountCodeBasicCreateProjectionRoot<PARENT, ROOT>, DiscountCodeBasicCreateProjectionRoot<PARENT, ROOT>> codeDiscountNode(
      ) {
    DiscountCodeNodeProjection<DiscountCodeBasicCreateProjectionRoot<PARENT, ROOT>, DiscountCodeBasicCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeProjection<>(this, this);    
    getFields().put("codeDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeBasicCreateProjectionRoot<PARENT, ROOT>, DiscountCodeBasicCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeBasicCreateProjectionRoot<PARENT, ROOT>, DiscountCodeBasicCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
