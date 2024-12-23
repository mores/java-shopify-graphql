package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ExternalVideoFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ExternalVideoFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExternalVideo"));
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileErrorProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> fileErrors() {
     FileErrorProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new FileErrorProjection<>(this, getRoot());
     getFields().put("fileErrors", projection);
     return projection;
  }

  public FileStatusProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> fileStatus() {
     FileStatusProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new FileStatusProjection<>(this, getRoot());
     getFields().put("fileStatus", projection);
     return projection;
  }

  public MediaHostProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> host() {
     MediaHostProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaHostProjection<>(this, getRoot());
     getFields().put("host", projection);
     return projection;
  }

  public MediaContentTypeProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> mediaContentType(
      ) {
     MediaContentTypeProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaErrorProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> mediaErrors() {
     MediaErrorProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaErrorProjection<>(this, getRoot());
     getFields().put("mediaErrors", projection);
     return projection;
  }

  public MediaWarningProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> mediaWarnings(
      ) {
     MediaWarningProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaWarningProjection<>(this, getRoot());
     getFields().put("mediaWarnings", projection);
     return projection;
  }

  public MediaPreviewImageProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> preview(
      ) {
     MediaPreviewImageProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaPreviewImageProjection<>(this, getRoot());
     getFields().put("preview", projection);
     return projection;
  }

  public MediaStatusProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> status() {
     MediaStatusProjection<ExternalVideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> embedUrl() {
    getFields().put("embedUrl", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> embeddedUrl() {
    getFields().put("embeddedUrl", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> originUrl() {
    getFields().put("originUrl", null);
    return this;
  }

  public ExternalVideoFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ExternalVideo {");
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
