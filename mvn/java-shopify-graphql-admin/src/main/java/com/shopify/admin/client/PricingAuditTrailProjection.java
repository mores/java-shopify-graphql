package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PricingAuditTrailProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PricingAuditTrailProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PricingAuditTrail"));
  }

  public PricingAuditTrailProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AuditTrailAdjustmentProjection<PricingAuditTrailProjection<PARENT, ROOT>, ROOT> priceAdjustments(
      ) {
     AuditTrailAdjustmentProjection<PricingAuditTrailProjection<PARENT, ROOT>, ROOT> projection = new AuditTrailAdjustmentProjection<>(this, getRoot());
     getFields().put("priceAdjustments", projection);
     return projection;
  }
}
