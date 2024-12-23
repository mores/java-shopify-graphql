package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TenderTransactionDetailsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TenderTransactionDetailsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TenderTransactionDetails"));
  }

  public TenderTransactionDetailsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TenderTransactionCreditCardDetailsFragmentProjection<TenderTransactionDetailsProjection<PARENT, ROOT>, ROOT> onTenderTransactionCreditCardDetails(
      ) {
    TenderTransactionCreditCardDetailsFragmentProjection<TenderTransactionDetailsProjection<PARENT, ROOT>, ROOT> fragment = new TenderTransactionCreditCardDetailsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
