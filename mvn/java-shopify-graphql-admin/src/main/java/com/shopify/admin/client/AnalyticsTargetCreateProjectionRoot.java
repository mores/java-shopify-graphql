package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsTargetCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsTargetCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("AnalyticsTargetCreatePayload"));
  }

  public AnalyticsTargetCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsTargetProjection<AnalyticsTargetCreateProjectionRoot<PARENT, ROOT>, AnalyticsTargetCreateProjectionRoot<PARENT, ROOT>> analyticsTarget(
      ) {
    AnalyticsTargetProjection<AnalyticsTargetCreateProjectionRoot<PARENT, ROOT>, AnalyticsTargetCreateProjectionRoot<PARENT, ROOT>> projection = new AnalyticsTargetProjection<>(this, this);    
    getFields().put("analyticsTarget", projection);
    return projection;
  }

  public AnalyticsTargetCreateUserErrorProjection<AnalyticsTargetCreateProjectionRoot<PARENT, ROOT>, AnalyticsTargetCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AnalyticsTargetCreateUserErrorProjection<AnalyticsTargetCreateProjectionRoot<PARENT, ROOT>, AnalyticsTargetCreateProjectionRoot<PARENT, ROOT>> projection = new AnalyticsTargetCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
