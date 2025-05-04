package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderDisputeSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderDisputeSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderDisputeSummary"));
  }

  public OrderDisputeSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DisputeTypeProjection<OrderDisputeSummaryProjection<PARENT, ROOT>, ROOT> initiatedAs() {
     DisputeTypeProjection<OrderDisputeSummaryProjection<PARENT, ROOT>, ROOT> projection = new DisputeTypeProjection<>(this, getRoot());
     getFields().put("initiatedAs", projection);
     return projection;
  }

  public DisputeStatusProjection<OrderDisputeSummaryProjection<PARENT, ROOT>, ROOT> status() {
     DisputeStatusProjection<OrderDisputeSummaryProjection<PARENT, ROOT>, ROOT> projection = new DisputeStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public OrderDisputeSummaryProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
