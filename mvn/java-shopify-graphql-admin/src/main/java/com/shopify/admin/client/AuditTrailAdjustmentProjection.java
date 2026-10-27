package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AuditTrailAdjustmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AuditTrailAdjustmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AuditTrailAdjustment"));
  }

  public AuditTrailAdjustmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AuditTrailAdjustmentProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<AuditTrailAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public AuditTrailAdjustmentTypeProjection<AuditTrailAdjustmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     AuditTrailAdjustmentTypeProjection<AuditTrailAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new AuditTrailAdjustmentTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public AuditTrailAdjustmentProjection<PARENT, ROOT> label() {
    getFields().put("label", null);
    return this;
  }

  public AuditTrailAdjustmentProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
