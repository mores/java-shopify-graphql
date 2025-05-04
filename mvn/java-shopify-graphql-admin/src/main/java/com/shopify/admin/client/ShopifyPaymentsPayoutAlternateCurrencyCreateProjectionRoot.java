package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopifyPaymentsPayoutAlternateCurrencyCreatePayload"));
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsToolingProviderPayoutProjection<ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT>, ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT>> payout(
      ) {
    ShopifyPaymentsToolingProviderPayoutProjection<ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT>, ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsToolingProviderPayoutProjection<>(this, this);    
    getFields().put("payout", projection);
    return projection;
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection<ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT>, ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection<ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT>, ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateProjectionRoot<PARENT, ROOT> success() {
    getFields().put("success", null);
    return this;
  }
}
