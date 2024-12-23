package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAdjustmentDiscrepancyReasonProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAdjustmentDiscrepancyReasonProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAdjustmentDiscrepancyReason"));
  }

  public OrderAdjustmentDiscrepancyReasonProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
