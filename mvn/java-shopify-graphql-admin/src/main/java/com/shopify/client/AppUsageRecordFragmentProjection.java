package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppUsageRecordFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppUsageRecordFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppUsageRecord"));
  }

  public AppUsageRecordFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppUsageRecordFragmentProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<AppUsageRecordFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public AppSubscriptionLineItemProjection<AppUsageRecordFragmentProjection<PARENT, ROOT>, ROOT> subscriptionLineItem(
      ) {
     AppSubscriptionLineItemProjection<AppUsageRecordFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionLineItemProjection<>(this, getRoot());
     getFields().put("subscriptionLineItem", projection);
     return projection;
  }

  public AppUsageRecordFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppUsageRecordFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppUsageRecordFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppUsageRecordFragmentProjection<PARENT, ROOT> idempotencyKey() {
    getFields().put("idempotencyKey", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppUsageRecord {");
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
