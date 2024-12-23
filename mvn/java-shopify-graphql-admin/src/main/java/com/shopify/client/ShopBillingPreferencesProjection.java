package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopBillingPreferencesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopBillingPreferencesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopBillingPreferences"));
  }

  public ShopBillingPreferencesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<ShopBillingPreferencesProjection<PARENT, ROOT>, ROOT> currency() {
     CurrencyCodeProjection<ShopBillingPreferencesProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }
}
