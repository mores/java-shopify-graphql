package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsAnnotationUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsAnnotationUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsAnnotationUpdateUserError"));
  }

  public AnalyticsAnnotationUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsAnnotationUpdateUserErrorCodeProjection<AnalyticsAnnotationUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     AnalyticsAnnotationUpdateUserErrorCodeProjection<AnalyticsAnnotationUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsAnnotationUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public AnalyticsAnnotationUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public AnalyticsAnnotationUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
