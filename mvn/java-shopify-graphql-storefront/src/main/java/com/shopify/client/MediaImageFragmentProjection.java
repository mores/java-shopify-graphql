package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MediaImageFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MediaImageFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaImage"));
  }

  public MediaImageFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<MediaImageFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<MediaImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MediaContentTypeProjection<MediaImageFragmentProjection<PARENT, ROOT>, ROOT> mediaContentType(
      ) {
     MediaContentTypeProjection<MediaImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaPresentationProjection<MediaImageFragmentProjection<PARENT, ROOT>, ROOT> presentation(
      ) {
     MediaPresentationProjection<MediaImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaPresentationProjection<>(this, getRoot());
     getFields().put("presentation", projection);
     return projection;
  }

  public ImageProjection<MediaImageFragmentProjection<PARENT, ROOT>, ROOT> previewImage() {
     ImageProjection<MediaImageFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("previewImage", projection);
     return projection;
  }

  public MediaImageFragmentProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public MediaImageFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MediaImage {");
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
