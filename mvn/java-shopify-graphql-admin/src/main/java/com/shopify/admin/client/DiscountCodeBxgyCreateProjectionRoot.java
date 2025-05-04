package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeBxgyCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeBxgyCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeBxgyCreatePayload"));
  }

  public DiscountCodeBxgyCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeNodeProjection<DiscountCodeBxgyCreateProjectionRoot<PARENT, ROOT>, DiscountCodeBxgyCreateProjectionRoot<PARENT, ROOT>> codeDiscountNode(
      ) {
    DiscountCodeNodeProjection<DiscountCodeBxgyCreateProjectionRoot<PARENT, ROOT>, DiscountCodeBxgyCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeProjection<>(this, this);    
    getFields().put("codeDiscountNode", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeBxgyCreateProjectionRoot<PARENT, ROOT>, DiscountCodeBxgyCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeBxgyCreateProjectionRoot<PARENT, ROOT>, DiscountCodeBxgyCreateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
