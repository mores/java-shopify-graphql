package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldCapabilityAnalyticsQueryableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldCapabilityAnalyticsQueryableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldCapabilityAnalyticsQueryable"));
  }

  public MetafieldCapabilityAnalyticsQueryableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldCapabilityAnalyticsQueryableProjection<PARENT, ROOT> eligible() {
    getFields().put("eligible", null);
    return this;
  }

  public MetafieldCapabilityAnalyticsQueryableProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
