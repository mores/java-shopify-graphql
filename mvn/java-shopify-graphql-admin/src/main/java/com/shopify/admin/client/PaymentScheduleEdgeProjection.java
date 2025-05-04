package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentScheduleEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentScheduleEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentScheduleEdge"));
  }

  public PaymentScheduleEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentScheduleProjection<PaymentScheduleEdgeProjection<PARENT, ROOT>, ROOT> node() {
     PaymentScheduleProjection<PaymentScheduleEdgeProjection<PARENT, ROOT>, ROOT> projection = new PaymentScheduleProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PaymentScheduleEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
