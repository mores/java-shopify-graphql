package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppUsageRecordProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppUsageRecordProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppUsageRecord"));
  }

  public AppUsageRecordProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppUsageRecordProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<AppUsageRecordProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public AppSubscriptionLineItemProjection<AppUsageRecordProjection<PARENT, ROOT>, ROOT> subscriptionLineItem(
      ) {
     AppSubscriptionLineItemProjection<AppUsageRecordProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionLineItemProjection<>(this, getRoot());
     getFields().put("subscriptionLineItem", projection);
     return projection;
  }

  public AppUsageRecordProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppUsageRecordProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppUsageRecordProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppUsageRecordProjection<PARENT, ROOT> idempotencyKey() {
    getFields().put("idempotencyKey", null);
    return this;
  }
}
