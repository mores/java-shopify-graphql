package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsPayoutAlternateCurrencyCreateUserError"));
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCodeProjection<ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCodeProjection<ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
