package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentSettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentSettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentSettings"));
  }

  public PaymentSettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DigitalWalletProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> supportedDigitalWallets(
      ) {
     DigitalWalletProjection<PaymentSettingsProjection<PARENT, ROOT>, ROOT> projection = new DigitalWalletProjection<>(this, getRoot());
     getFields().put("supportedDigitalWallets", projection);
     return projection;
  }
}
