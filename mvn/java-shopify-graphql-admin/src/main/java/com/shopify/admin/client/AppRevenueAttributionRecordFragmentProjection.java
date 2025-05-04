package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppRevenueAttributionRecordFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppRevenueAttributionRecordFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppRevenueAttributionRecord"));
  }

  public AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public AppRevenueAttributionTypeProjection<AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     AppRevenueAttributionTypeProjection<AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT> capturedAt() {
    getFields().put("capturedAt", null);
    return this;
  }

  public AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT> idempotencyKey() {
    getFields().put("idempotencyKey", null);
    return this;
  }

  public AppRevenueAttributionRecordFragmentProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppRevenueAttributionRecord {");
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
