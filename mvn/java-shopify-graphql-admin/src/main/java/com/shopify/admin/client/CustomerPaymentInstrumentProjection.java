package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentInstrumentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentInstrumentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentInstrument"));
  }

  public CustomerPaymentInstrumentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerCreditCardFragmentProjection<CustomerPaymentInstrumentProjection<PARENT, ROOT>, ROOT> onCustomerCreditCard(
      ) {
    CustomerCreditCardFragmentProjection<CustomerPaymentInstrumentProjection<PARENT, ROOT>, ROOT> fragment = new CustomerCreditCardFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerPaypalBillingAgreementFragmentProjection<CustomerPaymentInstrumentProjection<PARENT, ROOT>, ROOT> onCustomerPaypalBillingAgreement(
      ) {
    CustomerPaypalBillingAgreementFragmentProjection<CustomerPaymentInstrumentProjection<PARENT, ROOT>, ROOT> fragment = new CustomerPaypalBillingAgreementFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerShopPayAgreementFragmentProjection<CustomerPaymentInstrumentProjection<PARENT, ROOT>, ROOT> onCustomerShopPayAgreement(
      ) {
    CustomerShopPayAgreementFragmentProjection<CustomerPaymentInstrumentProjection<PARENT, ROOT>, ROOT> fragment = new CustomerShopPayAgreementFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
