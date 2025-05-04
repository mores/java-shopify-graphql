package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAdjustmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAdjustmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAdjustment"));
  }

  public OrderAdjustmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<OrderAdjustmentProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<OrderAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public OrderAdjustmentDiscrepancyReasonProjection<OrderAdjustmentProjection<PARENT, ROOT>, ROOT> reason(
      ) {
     OrderAdjustmentDiscrepancyReasonProjection<OrderAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new OrderAdjustmentDiscrepancyReasonProjection<>(this, getRoot());
     getFields().put("reason", projection);
     return projection;
  }

  public MoneyBagProjection<OrderAdjustmentProjection<PARENT, ROOT>, ROOT> taxAmountSet() {
     MoneyBagProjection<OrderAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("taxAmountSet", projection);
     return projection;
  }

  public OrderAdjustmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
