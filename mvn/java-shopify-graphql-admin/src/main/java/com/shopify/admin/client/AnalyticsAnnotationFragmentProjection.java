package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AnalyticsAnnotationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AnalyticsAnnotationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AnalyticsAnnotation"));
  }

  public AnalyticsAnnotationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<AnalyticsAnnotationFragmentProjection<PARENT, ROOT>, ROOT> createdByApp() {
     AppProjection<AnalyticsAnnotationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("createdByApp", projection);
     return projection;
  }

  public AnalyticsAnnotationSourceProjection<AnalyticsAnnotationFragmentProjection<PARENT, ROOT>, ROOT> source(
      ) {
     AnalyticsAnnotationSourceProjection<AnalyticsAnnotationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AnalyticsAnnotationSourceProjection<>(this, getRoot());
     getFields().put("source", projection);
     return projection;
  }

  public AnalyticsAnnotationFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AnalyticsAnnotationFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AnalyticsAnnotationFragmentProjection<PARENT, ROOT> endedAt() {
    getFields().put("endedAt", null);
    return this;
  }

  public AnalyticsAnnotationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AnalyticsAnnotationFragmentProjection<PARENT, ROOT> startedAt() {
    getFields().put("startedAt", null);
    return this;
  }

  public AnalyticsAnnotationFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AnalyticsAnnotationFragmentProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public AnalyticsAnnotationFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AnalyticsAnnotation {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
