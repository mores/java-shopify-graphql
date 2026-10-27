package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AuditTrailAdjustmentTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AuditTrailAdjustmentTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AuditTrailAdjustmentType"));
  }

  public AuditTrailAdjustmentTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
