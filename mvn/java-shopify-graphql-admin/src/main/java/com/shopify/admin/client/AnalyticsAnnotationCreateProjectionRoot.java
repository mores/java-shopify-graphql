package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsAnnotationCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsAnnotationCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("AnalyticsAnnotationCreatePayload"));
  }

  public AnalyticsAnnotationCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsAnnotationProjection<AnalyticsAnnotationCreateProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationCreateProjectionRoot<PARENT, ROOT>> analyticsAnnotation(
      ) {
    AnalyticsAnnotationProjection<AnalyticsAnnotationCreateProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationCreateProjectionRoot<PARENT, ROOT>> projection = new AnalyticsAnnotationProjection<>(this, this);    
    getFields().put("analyticsAnnotation", projection);
    return projection;
  }

  public AnalyticsAnnotationCreateUserErrorProjection<AnalyticsAnnotationCreateProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AnalyticsAnnotationCreateUserErrorProjection<AnalyticsAnnotationCreateProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationCreateProjectionRoot<PARENT, ROOT>> projection = new AnalyticsAnnotationCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
