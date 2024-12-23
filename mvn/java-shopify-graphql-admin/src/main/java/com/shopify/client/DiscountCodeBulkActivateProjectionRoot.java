package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeBulkActivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeBulkActivateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeBulkActivatePayload"));
  }

  public DiscountCodeBulkActivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DiscountCodeBulkActivateProjectionRoot<PARENT, ROOT>, DiscountCodeBulkActivateProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DiscountCodeBulkActivateProjectionRoot<PARENT, ROOT>, DiscountCodeBulkActivateProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeBulkActivateProjectionRoot<PARENT, ROOT>, DiscountCodeBulkActivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeBulkActivateProjectionRoot<PARENT, ROOT>, DiscountCodeBulkActivateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
