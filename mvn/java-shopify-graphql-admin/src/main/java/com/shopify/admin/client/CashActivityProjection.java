package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashActivityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashActivityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashActivity"));
  }

  public CashActivityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CashActivityProjection<PARENT, ROOT>, ROOT> cash() {
     MoneyV2Projection<CashActivityProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cash", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionProjection<CashActivityProjection<PARENT, ROOT>, ROOT> paymentSession(
      ) {
     PointOfSaleDevicePaymentSessionProjection<CashActivityProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, getRoot());
     getFields().put("paymentSession", projection);
     return projection;
  }

  public StaffMemberProjection<CashActivityProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<CashActivityProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public CashActivityProjection<PARENT, ROOT> time() {
    getFields().put("time", null);
    return this;
  }

  public CashAdjustmentActivityFragmentProjection<CashActivityProjection<PARENT, ROOT>, ROOT> onCashAdjustmentActivity(
      ) {
    CashAdjustmentActivityFragmentProjection<CashActivityProjection<PARENT, ROOT>, ROOT> fragment = new CashAdjustmentActivityFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CashCountActivityFragmentProjection<CashActivityProjection<PARENT, ROOT>, ROOT> onCashCountActivity(
      ) {
    CashCountActivityFragmentProjection<CashActivityProjection<PARENT, ROOT>, ROOT> fragment = new CashCountActivityFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CashTransactionActivityFragmentProjection<CashActivityProjection<PARENT, ROOT>, ROOT> onCashTransactionActivity(
      ) {
    CashTransactionActivityFragmentProjection<CashActivityProjection<PARENT, ROOT>, ROOT> fragment = new CashTransactionActivityFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
