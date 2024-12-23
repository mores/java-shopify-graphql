package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppRevenueAttributionRecordProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppRevenueAttributionRecordProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppRevenueAttributionRecord"));
  }

  public AppRevenueAttributionRecordProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppRevenueAttributionRecordProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<AppRevenueAttributionRecordProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public AppRevenueAttributionTypeProjection<AppRevenueAttributionRecordProjection<PARENT, ROOT>, ROOT> type(
      ) {
     AppRevenueAttributionTypeProjection<AppRevenueAttributionRecordProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public AppRevenueAttributionRecordProjection<PARENT, ROOT> capturedAt() {
    getFields().put("capturedAt", null);
    return this;
  }

  public AppRevenueAttributionRecordProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppRevenueAttributionRecordProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppRevenueAttributionRecordProjection<PARENT, ROOT> idempotencyKey() {
    getFields().put("idempotencyKey", null);
    return this;
  }

  public AppRevenueAttributionRecordProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }
}
