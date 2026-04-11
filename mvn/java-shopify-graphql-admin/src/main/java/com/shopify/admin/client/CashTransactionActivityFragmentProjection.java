package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CashTransactionActivityFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CashTransactionActivityFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashTransactionActivity"));
  }

  public CashTransactionActivityFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> cash() {
     MoneyV2Projection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cash", projection);
     return projection;
  }

  public OrderTransactionProjection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> orderTransaction(
      ) {
     OrderTransactionProjection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("orderTransaction", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionProjection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> paymentSession(
      ) {
     PointOfSaleDevicePaymentSessionProjection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, getRoot());
     getFields().put("paymentSession", projection);
     return projection;
  }

  public StaffMemberProjection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> staffMember(
      ) {
     StaffMemberProjection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public CashTransactionActivityTypeProjection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     CashTransactionActivityTypeProjection<CashTransactionActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashTransactionActivityTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public CashTransactionActivityFragmentProjection<PARENT, ROOT> time() {
    getFields().put("time", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CashTransactionActivity {");
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
