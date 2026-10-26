package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsTargetsDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsTargetsDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("AnalyticsTargetsDeletePayload"));
  }

  public AnalyticsTargetsDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsTargetsDeleteUserErrorProjection<AnalyticsTargetsDeleteProjectionRoot<PARENT, ROOT>, AnalyticsTargetsDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AnalyticsTargetsDeleteUserErrorProjection<AnalyticsTargetsDeleteProjectionRoot<PARENT, ROOT>, AnalyticsTargetsDeleteProjectionRoot<PARENT, ROOT>> projection = new AnalyticsTargetsDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public AnalyticsTargetsDeleteProjectionRoot<PARENT, ROOT> deletedIds() {
    getFields().put("deletedIds", null);
    return this;
  }
}
