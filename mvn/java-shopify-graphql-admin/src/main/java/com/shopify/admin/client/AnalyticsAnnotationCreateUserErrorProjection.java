package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AnalyticsAnnotationCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AnalyticsAnnotationCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsAnnotationCreateUserError"));
  }

  public AnalyticsAnnotationCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AnalyticsAnnotationCreateUserErrorCodeProjection<AnalyticsAnnotationCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     AnalyticsAnnotationCreateUserErrorCodeProjection<AnalyticsAnnotationCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsAnnotationCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public AnalyticsAnnotationCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public AnalyticsAnnotationCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
