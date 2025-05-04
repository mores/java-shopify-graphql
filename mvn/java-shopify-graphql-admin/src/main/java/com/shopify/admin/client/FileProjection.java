package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FileProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FileProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("File"));
  }

  public FileProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileErrorProjection<FileProjection<PARENT, ROOT>, ROOT> fileErrors() {
     FileErrorProjection<FileProjection<PARENT, ROOT>, ROOT> projection = new FileErrorProjection<>(this, getRoot());
     getFields().put("fileErrors", projection);
     return projection;
  }

  public FileStatusProjection<FileProjection<PARENT, ROOT>, ROOT> fileStatus() {
     FileStatusProjection<FileProjection<PARENT, ROOT>, ROOT> projection = new FileStatusProjection<>(this, getRoot());
     getFields().put("fileStatus", projection);
     return projection;
  }

  public MediaPreviewImageProjection<FileProjection<PARENT, ROOT>, ROOT> preview() {
     MediaPreviewImageProjection<FileProjection<PARENT, ROOT>, ROOT> projection = new MediaPreviewImageProjection<>(this, getRoot());
     getFields().put("preview", projection);
     return projection;
  }

  public FileProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public FileProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public FileProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FileProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ExternalVideoFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> onExternalVideo() {
    ExternalVideoFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> fragment = new ExternalVideoFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GenericFileFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> onGenericFile() {
    GenericFileFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> fragment = new GenericFileFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MediaImageFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> onMediaImage() {
    MediaImageFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> fragment = new MediaImageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public Model3dFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> onModel3d() {
    Model3dFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> fragment = new Model3dFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public VideoFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> onVideo() {
    VideoFragmentProjection<FileProjection<PARENT, ROOT>, ROOT> fragment = new VideoFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
