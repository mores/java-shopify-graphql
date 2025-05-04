package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsToolingProviderPayoutProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsToolingProviderPayoutProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsToolingProviderPayout"));
  }

  public ShopifyPaymentsToolingProviderPayoutProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopifyPaymentsToolingProviderPayoutProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<ShopifyPaymentsToolingProviderPayoutProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public ShopifyPaymentsToolingProviderPayoutProjection<PARENT, ROOT> arrivalDate() {
    getFields().put("arrivalDate", null);
    return this;
  }

  public ShopifyPaymentsToolingProviderPayoutProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ShopifyPaymentsToolingProviderPayoutProjection<PARENT, ROOT> currency() {
    getFields().put("currency", null);
    return this;
  }

  public ShopifyPaymentsToolingProviderPayoutProjection<PARENT, ROOT> remoteId() {
    getFields().put("remoteId", null);
    return this;
  }
}
