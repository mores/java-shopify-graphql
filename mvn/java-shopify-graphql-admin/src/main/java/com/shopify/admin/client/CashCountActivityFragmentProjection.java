package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CashCountActivityFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CashCountActivityFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashCountActivity"));
  }

  public CashCountActivityFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> cash() {
     MoneyV2Projection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cash", projection);
     return projection;
  }

  public MoneyV2Projection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> cashCounted() {
     MoneyV2Projection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cashCounted", projection);
     return projection;
  }

  public MoneyV2Projection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> cashDiscrepancy(
      ) {
     MoneyV2Projection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cashDiscrepancy", projection);
     return projection;
  }

  public MoneyV2Projection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> cashExpected() {
     MoneyV2Projection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cashExpected", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionProjection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> paymentSession(
      ) {
     PointOfSaleDevicePaymentSessionProjection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionProjection<>(this, getRoot());
     getFields().put("paymentSession", projection);
     return projection;
  }

  public StaffMemberProjection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> staffMember(
      ) {
     StaffMemberProjection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public CashCountActivityTypeProjection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     CashCountActivityTypeProjection<CashCountActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashCountActivityTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public CashCountActivityFragmentProjection<PARENT, ROOT> time() {
    getFields().put("time", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CashCountActivity {");
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
