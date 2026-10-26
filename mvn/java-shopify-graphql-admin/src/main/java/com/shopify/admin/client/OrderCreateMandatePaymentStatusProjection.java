package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCreateMandatePaymentStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCreateMandatePaymentStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCreateMandatePaymentStatus"));
  }

  public OrderCreateMandatePaymentStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
