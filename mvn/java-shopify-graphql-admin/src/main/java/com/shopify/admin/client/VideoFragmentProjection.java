package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class VideoFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public VideoFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Video"));
  }

  public VideoFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileErrorProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> fileErrors() {
     FileErrorProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new FileErrorProjection<>(this, getRoot());
     getFields().put("fileErrors", projection);
     return projection;
  }

  public FileStatusProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> fileStatus() {
     FileStatusProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new FileStatusProjection<>(this, getRoot());
     getFields().put("fileStatus", projection);
     return projection;
  }

  public MediaContentTypeProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> mediaContentType(
      ) {
     MediaContentTypeProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaErrorProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> mediaErrors() {
     MediaErrorProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaErrorProjection<>(this, getRoot());
     getFields().put("mediaErrors", projection);
     return projection;
  }

  public MediaWarningProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> mediaWarnings() {
     MediaWarningProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaWarningProjection<>(this, getRoot());
     getFields().put("mediaWarnings", projection);
     return projection;
  }

  public VideoSourceProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> originalSource() {
     VideoSourceProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new VideoSourceProjection<>(this, getRoot());
     getFields().put("originalSource", projection);
     return projection;
  }

  public MediaPreviewImageProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> preview() {
     MediaPreviewImageProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaPreviewImageProjection<>(this, getRoot());
     getFields().put("preview", projection);
     return projection;
  }

  public VideoSourceProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> sources() {
     VideoSourceProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new VideoSourceProjection<>(this, getRoot());
     getFields().put("sources", projection);
     return projection;
  }

  public MediaStatusProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> status() {
     MediaStatusProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public VideoFragmentProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public VideoFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public VideoFragmentProjection<PARENT, ROOT> duration() {
    getFields().put("duration", null);
    return this;
  }

  public VideoFragmentProjection<PARENT, ROOT> filename() {
    getFields().put("filename", null);
    return this;
  }

  public VideoFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public VideoFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Video {");
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
