package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopBillingPreferencesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopBillingPreferencesProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopBillingPreferences"));
  }

  public ShopBillingPreferencesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<ShopBillingPreferencesProjectionRoot<PARENT, ROOT>, ShopBillingPreferencesProjectionRoot<PARENT, ROOT>> currency(
      ) {
    CurrencyCodeProjection<ShopBillingPreferencesProjectionRoot<PARENT, ROOT>, ShopBillingPreferencesProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currency", projection);
    return projection;
  }
}
