package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementReasonCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementReasonCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementReasonCode"));
  }

  public CashManagementReasonCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementCustomReasonCodeFragmentProjection<CashManagementReasonCodeProjection<PARENT, ROOT>, ROOT> onCashManagementCustomReasonCode(
      ) {
    CashManagementCustomReasonCodeFragmentProjection<CashManagementReasonCodeProjection<PARENT, ROOT>, ROOT> fragment = new CashManagementCustomReasonCodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CashManagementDefaultReasonCodeFragmentProjection<CashManagementReasonCodeProjection<PARENT, ROOT>, ROOT> onCashManagementDefaultReasonCode(
      ) {
    CashManagementDefaultReasonCodeFragmentProjection<CashManagementReasonCodeProjection<PARENT, ROOT>, ROOT> fragment = new CashManagementDefaultReasonCodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CashManagementSystemReasonCodeFragmentProjection<CashManagementReasonCodeProjection<PARENT, ROOT>, ROOT> onCashManagementSystemReasonCode(
      ) {
    CashManagementSystemReasonCodeFragmentProjection<CashManagementReasonCodeProjection<PARENT, ROOT>, ROOT> fragment = new CashManagementSystemReasonCodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
