package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderAdjustmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderAdjustmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAdjustment"));
  }

  public OrderAdjustmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<OrderAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<OrderAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public OrderAdjustmentDiscrepancyReasonProjection<OrderAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> reason(
      ) {
     OrderAdjustmentDiscrepancyReasonProjection<OrderAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderAdjustmentDiscrepancyReasonProjection<>(this, getRoot());
     getFields().put("reason", projection);
     return projection;
  }

  public MoneyBagProjection<OrderAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> taxAmountSet() {
     MoneyBagProjection<OrderAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("taxAmountSet", projection);
     return projection;
  }

  public OrderAdjustmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderAdjustment {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
