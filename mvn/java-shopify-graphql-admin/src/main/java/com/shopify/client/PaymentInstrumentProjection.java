package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentInstrumentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentInstrumentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentInstrument"));
  }

  public PaymentInstrumentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public VaultCreditCardFragmentProjection<PaymentInstrumentProjection<PARENT, ROOT>, ROOT> onVaultCreditCard(
      ) {
    VaultCreditCardFragmentProjection<PaymentInstrumentProjection<PARENT, ROOT>, ROOT> fragment = new VaultCreditCardFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public VaultPaypalBillingAgreementFragmentProjection<PaymentInstrumentProjection<PARENT, ROOT>, ROOT> onVaultPaypalBillingAgreement(
      ) {
    VaultPaypalBillingAgreementFragmentProjection<PaymentInstrumentProjection<PARENT, ROOT>, ROOT> fragment = new VaultPaypalBillingAgreementFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
