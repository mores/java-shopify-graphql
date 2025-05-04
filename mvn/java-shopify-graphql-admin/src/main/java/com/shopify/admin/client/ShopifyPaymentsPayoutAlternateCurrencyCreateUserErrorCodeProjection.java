package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCodeProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCode"));
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCodeProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
