package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardCrossCurrencyRedemptionStrategyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardCrossCurrencyRedemptionStrategyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardCrossCurrencyRedemptionStrategy"));
  }

  public GiftCardCrossCurrencyRedemptionStrategyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
