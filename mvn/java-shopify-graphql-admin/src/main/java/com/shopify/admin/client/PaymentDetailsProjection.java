package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentDetailsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentDetailsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentDetails"));
  }

  public PaymentDetailsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CardPaymentDetailsFragmentProjection<PaymentDetailsProjection<PARENT, ROOT>, ROOT> onCardPaymentDetails(
      ) {
    CardPaymentDetailsFragmentProjection<PaymentDetailsProjection<PARENT, ROOT>, ROOT> fragment = new CardPaymentDetailsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public LocalPaymentMethodsPaymentDetailsFragmentProjection<PaymentDetailsProjection<PARENT, ROOT>, ROOT> onLocalPaymentMethodsPaymentDetails(
      ) {
    LocalPaymentMethodsPaymentDetailsFragmentProjection<PaymentDetailsProjection<PARENT, ROOT>, ROOT> fragment = new LocalPaymentMethodsPaymentDetailsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PaypalWalletPaymentDetailsFragmentProjection<PaymentDetailsProjection<PARENT, ROOT>, ROOT> onPaypalWalletPaymentDetails(
      ) {
    PaypalWalletPaymentDetailsFragmentProjection<PaymentDetailsProjection<PARENT, ROOT>, ROOT> fragment = new PaypalWalletPaymentDetailsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPayInstallmentsPaymentDetailsFragmentProjection<PaymentDetailsProjection<PARENT, ROOT>, ROOT> onShopPayInstallmentsPaymentDetails(
      ) {
    ShopPayInstallmentsPaymentDetailsFragmentProjection<PaymentDetailsProjection<PARENT, ROOT>, ROOT> fragment = new ShopPayInstallmentsPaymentDetailsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
