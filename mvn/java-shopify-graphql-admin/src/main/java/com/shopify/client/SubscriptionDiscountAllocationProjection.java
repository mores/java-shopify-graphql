package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDiscountAllocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDiscountAllocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDiscountAllocation"));
  }

  public SubscriptionDiscountAllocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<SubscriptionDiscountAllocationProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<SubscriptionDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public SubscriptionDiscountProjection<SubscriptionDiscountAllocationProjection<PARENT, ROOT>, ROOT> discount(
      ) {
     SubscriptionDiscountProjection<SubscriptionDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountProjection<>(this, getRoot());
     getFields().put("discount", projection);
     return projection;
  }
}
