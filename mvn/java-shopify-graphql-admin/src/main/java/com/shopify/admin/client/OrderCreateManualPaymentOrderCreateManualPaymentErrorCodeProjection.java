package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCreateManualPaymentOrderCreateManualPaymentErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCreateManualPaymentOrderCreateManualPaymentErrorCodeProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCreateManualPaymentOrderCreateManualPaymentErrorCode"));
  }

  public OrderCreateManualPaymentOrderCreateManualPaymentErrorCodeProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
