package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaImageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaImageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MediaImage"));
  }

  public MediaImageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<MediaImageProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MediaContentTypeProjection<MediaImageProjection<PARENT, ROOT>, ROOT> mediaContentType() {
     MediaContentTypeProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaPresentationProjection<MediaImageProjection<PARENT, ROOT>, ROOT> presentation() {
     MediaPresentationProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new MediaPresentationProjection<>(this, getRoot());
     getFields().put("presentation", projection);
     return projection;
  }

  public ImageProjection<MediaImageProjection<PARENT, ROOT>, ROOT> previewImage() {
     ImageProjection<MediaImageProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("previewImage", projection);
     return projection;
  }

  public MediaImageProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public MediaImageProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
