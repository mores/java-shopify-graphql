package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeBulkDeactivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeBulkDeactivateProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeBulkDeactivatePayload"));
  }

  public DiscountCodeBulkDeactivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DiscountCodeBulkDeactivateProjectionRoot<PARENT, ROOT>, DiscountCodeBulkDeactivateProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DiscountCodeBulkDeactivateProjectionRoot<PARENT, ROOT>, DiscountCodeBulkDeactivateProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeBulkDeactivateProjectionRoot<PARENT, ROOT>, DiscountCodeBulkDeactivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeBulkDeactivateProjectionRoot<PARENT, ROOT>, DiscountCodeBulkDeactivateProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
