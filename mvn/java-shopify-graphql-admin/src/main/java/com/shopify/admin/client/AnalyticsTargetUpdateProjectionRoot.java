package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsTargetUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsTargetUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("AnalyticsTargetUpdatePayload"));
  }

  public AnalyticsTargetUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsTargetProjection<AnalyticsTargetUpdateProjectionRoot<PARENT, ROOT>, AnalyticsTargetUpdateProjectionRoot<PARENT, ROOT>> analyticsTarget(
      ) {
    AnalyticsTargetProjection<AnalyticsTargetUpdateProjectionRoot<PARENT, ROOT>, AnalyticsTargetUpdateProjectionRoot<PARENT, ROOT>> projection = new AnalyticsTargetProjection<>(this, this);    
    getFields().put("analyticsTarget", projection);
    return projection;
  }

  public AnalyticsTargetUpdateUserErrorProjection<AnalyticsTargetUpdateProjectionRoot<PARENT, ROOT>, AnalyticsTargetUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AnalyticsTargetUpdateUserErrorProjection<AnalyticsTargetUpdateProjectionRoot<PARENT, ROOT>, AnalyticsTargetUpdateProjectionRoot<PARENT, ROOT>> projection = new AnalyticsTargetUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
