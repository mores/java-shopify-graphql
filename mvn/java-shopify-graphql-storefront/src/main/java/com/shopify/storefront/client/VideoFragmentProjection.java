package com.shopify.storefront.client;

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

  public MediaContentTypeProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> mediaContentType(
      ) {
     MediaContentTypeProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaPresentationProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> presentation() {
     MediaPresentationProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaPresentationProjection<>(this, getRoot());
     getFields().put("presentation", projection);
     return projection;
  }

  public ImageProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> previewImage() {
     ImageProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("previewImage", projection);
     return projection;
  }

  public VideoSourceProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> sources() {
     VideoSourceProjection<VideoFragmentProjection<PARENT, ROOT>, ROOT> projection = new VideoSourceProjection<>(this, getRoot());
     getFields().put("sources", projection);
     return projection;
  }

  public VideoFragmentProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public VideoFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
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
