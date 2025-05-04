package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentCustomizationErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentCustomizationErrorCode"));
  }

  public PaymentCustomizationErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
