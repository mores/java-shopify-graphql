package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeRedeemCodeBulkDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeRedeemCodeBulkDeletePayload"));
  }

  public DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT, ROOT>, DiscountCodeRedeemCodeBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
