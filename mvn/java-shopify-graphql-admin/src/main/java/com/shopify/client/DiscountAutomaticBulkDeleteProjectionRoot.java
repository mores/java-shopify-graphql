package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticBulkDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticBulkDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticBulkDeletePayload"));
  }

  public DiscountAutomaticBulkDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DiscountAutomaticBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountAutomaticBulkDeleteProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DiscountAutomaticBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountAutomaticBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountAutomaticBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountAutomaticBulkDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountAutomaticBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountAutomaticBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
