package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentScheduleConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentScheduleConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentScheduleConnection"));
  }

  public PaymentScheduleConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentScheduleEdgeProjection<PaymentScheduleConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     PaymentScheduleEdgeProjection<PaymentScheduleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PaymentScheduleEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PaymentScheduleProjection<PaymentScheduleConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     PaymentScheduleProjection<PaymentScheduleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PaymentScheduleProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PaymentScheduleConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<PaymentScheduleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
