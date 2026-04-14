package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CashAdjustmentActivityFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CashAdjustmentActivityFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashAdjustmentActivity"));
  }

  public CashAdjustmentActivityFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> cash() {
     MoneyV2Projection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cash", projection);
     return projection;
  }

  public GiftCardProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> giftCard(
      ) {
     GiftCardProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());
     getFields().put("giftCard", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> paymentSession(
      ) {
     PointOfSaleDevicePaymentSessionProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, getRoot());
     getFields().put("paymentSession", projection);
     return projection;
  }

  public CashManagementReasonCodeProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> reasonCode(
      ) {
     CashManagementReasonCodeProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashManagementReasonCodeProjection<>(this, getRoot());
     getFields().put("reasonCode", projection);
     return projection;
  }

  public StaffMemberProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> staffMember(
      ) {
     StaffMemberProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public CashAdjustmentActivityTypeProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     CashAdjustmentActivityTypeProjection<CashAdjustmentActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashAdjustmentActivityTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public CashAdjustmentActivityFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CashAdjustmentActivityFragmentProjection<PARENT, ROOT> time() {
    getFields().put("time", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CashAdjustmentActivity {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
