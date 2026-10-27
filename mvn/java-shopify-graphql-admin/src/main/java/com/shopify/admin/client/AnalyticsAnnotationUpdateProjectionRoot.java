package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsAnnotationUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsAnnotationUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("AnalyticsAnnotationUpdatePayload"));
  }

  public AnalyticsAnnotationUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsAnnotationProjection<AnalyticsAnnotationUpdateProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationUpdateProjectionRoot<PARENT, ROOT>> analyticsAnnotation(
      ) {
    AnalyticsAnnotationProjection<AnalyticsAnnotationUpdateProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationUpdateProjectionRoot<PARENT, ROOT>> projection = new AnalyticsAnnotationProjection<>(this, this);    
    getFields().put("analyticsAnnotation", projection);
    return projection;
  }

  public AnalyticsAnnotationUpdateUserErrorProjection<AnalyticsAnnotationUpdateProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AnalyticsAnnotationUpdateUserErrorProjection<AnalyticsAnnotationUpdateProjectionRoot<PARENT, ROOT>, AnalyticsAnnotationUpdateProjectionRoot<PARENT, ROOT>> projection = new AnalyticsAnnotationUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
