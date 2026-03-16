package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnOutcomeFinancialTransferProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnOutcomeFinancialTransferProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnOutcomeFinancialTransfer"));
  }

  public ReturnOutcomeFinancialTransferProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InvoiceReturnOutcomeFragmentProjection<ReturnOutcomeFinancialTransferProjection<PARENT, ROOT>, ROOT> onInvoiceReturnOutcome(
      ) {
    InvoiceReturnOutcomeFragmentProjection<ReturnOutcomeFinancialTransferProjection<PARENT, ROOT>, ROOT> fragment = new InvoiceReturnOutcomeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public RefundReturnOutcomeFragmentProjection<ReturnOutcomeFinancialTransferProjection<PARENT, ROOT>, ROOT> onRefundReturnOutcome(
      ) {
    RefundReturnOutcomeFragmentProjection<ReturnOutcomeFinancialTransferProjection<PARENT, ROOT>, ROOT> fragment = new RefundReturnOutcomeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
