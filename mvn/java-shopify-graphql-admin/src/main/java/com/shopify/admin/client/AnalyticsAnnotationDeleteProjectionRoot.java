package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsAnnotationDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsAnnotationDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("AnalyticsAnnotationDeletePayload"));
  }

  public AnalyticsAnnotationDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsAnnotationDeleteUserErrorProjection<AnalyticsAnnotationDeleteProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AnalyticsAnnotationDeleteUserErrorProjection<AnalyticsAnnotationDeleteProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationDeleteProjectionRoot<PARENT, ROOT>> projection = new AnalyticsAnnotationDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public AnalyticsAnnotationDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
