package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsTargetUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsTargetUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsTargetUpdateUserError"));
  }

  public AnalyticsTargetUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsTargetUpdateUserErrorCodeProjection<AnalyticsTargetUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     AnalyticsTargetUpdateUserErrorCodeProjection<AnalyticsTargetUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsTargetUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public AnalyticsTargetUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public AnalyticsTargetUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
