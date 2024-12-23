package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsPayoutScheduleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsPayoutScheduleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsPayoutSchedule"));
  }

  public ShopifyPaymentsPayoutScheduleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsPayoutIntervalProjection<ShopifyPaymentsPayoutScheduleProjection<PARENT, ROOT>, ROOT> interval(
      ) {
     ShopifyPaymentsPayoutIntervalProjection<ShopifyPaymentsPayoutScheduleProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutIntervalProjection<>(this, getRoot());
     getFields().put("interval", projection);
     return projection;
  }

  public DayOfTheWeekProjection<ShopifyPaymentsPayoutScheduleProjection<PARENT, ROOT>, ROOT> weeklyAnchor(
      ) {
     DayOfTheWeekProjection<ShopifyPaymentsPayoutScheduleProjection<PARENT, ROOT>, ROOT> projection = new DayOfTheWeekProjection<>(this, getRoot());
     getFields().put("weeklyAnchor", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutScheduleProjection<PARENT, ROOT> monthlyAnchor() {
    getFields().put("monthlyAnchor", null);
    return this;
  }
}
