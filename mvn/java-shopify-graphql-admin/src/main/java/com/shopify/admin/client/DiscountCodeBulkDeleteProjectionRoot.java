package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeBulkDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeBulkDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeBulkDeletePayload"));
  }

  public DiscountCodeBulkDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DiscountCodeBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeBulkDeleteProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DiscountCodeBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeBulkDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
