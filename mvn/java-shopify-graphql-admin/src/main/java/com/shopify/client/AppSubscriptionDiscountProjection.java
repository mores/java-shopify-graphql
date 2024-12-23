package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionDiscountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionDiscountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppSubscriptionDiscount"));
  }

  public AppSubscriptionDiscountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppSubscriptionDiscountProjection<PARENT, ROOT>, ROOT> priceAfterDiscount(
      ) {
     MoneyV2Projection<AppSubscriptionDiscountProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("priceAfterDiscount", projection);
     return projection;
  }

  public AppSubscriptionDiscountValueProjection<AppSubscriptionDiscountProjection<PARENT, ROOT>, ROOT> value(
      ) {
     AppSubscriptionDiscountValueProjection<AppSubscriptionDiscountProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionDiscountValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public AppSubscriptionDiscountProjection<PARENT, ROOT> durationLimitInIntervals() {
    getFields().put("durationLimitInIntervals", null);
    return this;
  }

  public AppSubscriptionDiscountProjection<PARENT, ROOT> remainingDurationInIntervals() {
    getFields().put("remainingDurationInIntervals", null);
    return this;
  }
}
