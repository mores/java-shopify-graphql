package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MediaProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MediaProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Media"));
  }

  public MediaProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MediaContentTypeProjection<MediaProjection<PARENT, ROOT>, ROOT> mediaContentType() {
     MediaContentTypeProjection<MediaProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaErrorProjection<MediaProjection<PARENT, ROOT>, ROOT> mediaErrors() {
     MediaErrorProjection<MediaProjection<PARENT, ROOT>, ROOT> projection = new MediaErrorProjection<>(this, getRoot());
     getFields().put("mediaErrors", projection);
     return projection;
  }

  public MediaWarningProjection<MediaProjection<PARENT, ROOT>, ROOT> mediaWarnings() {
     MediaWarningProjection<MediaProjection<PARENT, ROOT>, ROOT> projection = new MediaWarningProjection<>(this, getRoot());
     getFields().put("mediaWarnings", projection);
     return projection;
  }

  public MediaPreviewImageProjection<MediaProjection<PARENT, ROOT>, ROOT> preview() {
     MediaPreviewImageProjection<MediaProjection<PARENT, ROOT>, ROOT> projection = new MediaPreviewImageProjection<>(this, getRoot());
     getFields().put("preview", projection);
     return projection;
  }

  public MediaStatusProjection<MediaProjection<PARENT, ROOT>, ROOT> status() {
     MediaStatusProjection<MediaProjection<PARENT, ROOT>, ROOT> projection = new MediaStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MediaProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public MediaProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ExternalVideoFragmentProjection<MediaProjection<PARENT, ROOT>, ROOT> onExternalVideo() {
    ExternalVideoFragmentProjection<MediaProjection<PARENT, ROOT>, ROOT> fragment = new ExternalVideoFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MediaImageFragmentProjection<MediaProjection<PARENT, ROOT>, ROOT> onMediaImage() {
    MediaImageFragmentProjection<MediaProjection<PARENT, ROOT>, ROOT> fragment = new MediaImageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public Model3dFragmentProjection<MediaProjection<PARENT, ROOT>, ROOT> onModel3d() {
    Model3dFragmentProjection<MediaProjection<PARENT, ROOT>, ROOT> fragment = new Model3dFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public VideoFragmentProjection<MediaProjection<PARENT, ROOT>, ROOT> onVideo() {
    VideoFragmentProjection<MediaProjection<PARENT, ROOT>, ROOT> fragment = new VideoFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
