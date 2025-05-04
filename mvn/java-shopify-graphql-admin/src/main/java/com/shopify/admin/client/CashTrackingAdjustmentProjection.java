package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashTrackingAdjustmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashTrackingAdjustmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashTrackingAdjustment"));
  }

  public CashTrackingAdjustmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CashTrackingAdjustmentProjection<PARENT, ROOT>, ROOT> cash() {
     MoneyV2Projection<CashTrackingAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cash", projection);
     return projection;
  }

  public StaffMemberProjection<CashTrackingAdjustmentProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<CashTrackingAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public CashTrackingAdjustmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CashTrackingAdjustmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CashTrackingAdjustmentProjection<PARENT, ROOT> time() {
    getFields().put("time", null);
    return this;
  }
}
