package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CashTrackingAdjustmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CashTrackingAdjustmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashTrackingAdjustment"));
  }

  public CashTrackingAdjustmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CashTrackingAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> cash() {
     MoneyV2Projection<CashTrackingAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cash", projection);
     return projection;
  }

  public StaffMemberProjection<CashTrackingAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> staffMember(
      ) {
     StaffMemberProjection<CashTrackingAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public CashTrackingAdjustmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CashTrackingAdjustmentFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CashTrackingAdjustmentFragmentProjection<PARENT, ROOT> time() {
    getFields().put("time", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CashTrackingAdjustment {");
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
