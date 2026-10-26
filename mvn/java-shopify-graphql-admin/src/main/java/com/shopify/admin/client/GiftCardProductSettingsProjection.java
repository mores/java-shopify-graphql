package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardProductSettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardProductSettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardProductSettings"));
  }

  public GiftCardProductSettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<GiftCardProductSettingsProjection<PARENT, ROOT>, ROOT> issuanceCurrency(
      ) {
     CurrencyCodeProjection<GiftCardProductSettingsProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("issuanceCurrency", projection);
     return projection;
  }

  public GiftCardProductSettingsProjection<PARENT, ROOT> crossCurrencyRedeemable() {
    getFields().put("crossCurrencyRedeemable", null);
    return this;
  }
}
