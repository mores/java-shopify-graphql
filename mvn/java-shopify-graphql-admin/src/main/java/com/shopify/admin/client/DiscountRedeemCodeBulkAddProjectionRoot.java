package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountRedeemCodeBulkAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountRedeemCodeBulkAddProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountRedeemCodeBulkAddPayload"));
  }

  public DiscountRedeemCodeBulkAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeBulkCreationProjection<DiscountRedeemCodeBulkAddProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkAddProjectionRoot<PARENT, ROOT>> bulkCreation(
      ) {
    DiscountRedeemCodeBulkCreationProjection<DiscountRedeemCodeBulkAddProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkAddProjectionRoot<PARENT, ROOT>> projection = new DiscountRedeemCodeBulkCreationProjection<>(this, this);    
    getFields().put("bulkCreation", projection);
    return projection;
  }

  public DiscountUserErrorProjection<DiscountRedeemCodeBulkAddProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DiscountUserErrorProjection<DiscountRedeemCodeBulkAddProjectionRoot<PARENT, ROOT>, DiscountRedeemCodeBulkAddProjectionRoot<PARENT, ROOT>> projection = new DiscountUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
