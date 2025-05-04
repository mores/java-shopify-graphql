package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class Model3dFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public Model3dFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Model3d"));
  }

  public Model3dFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public Model3dBoundingBoxProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> boundingBox() {
     Model3dBoundingBoxProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new Model3dBoundingBoxProjection<>(this, getRoot());
     getFields().put("boundingBox", projection);
     return projection;
  }

  public FileErrorProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> fileErrors() {
     FileErrorProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new FileErrorProjection<>(this, getRoot());
     getFields().put("fileErrors", projection);
     return projection;
  }

  public FileStatusProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> fileStatus() {
     FileStatusProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new FileStatusProjection<>(this, getRoot());
     getFields().put("fileStatus", projection);
     return projection;
  }

  public MediaContentTypeProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> mediaContentType(
      ) {
     MediaContentTypeProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaErrorProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> mediaErrors() {
     MediaErrorProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaErrorProjection<>(this, getRoot());
     getFields().put("mediaErrors", projection);
     return projection;
  }

  public MediaWarningProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> mediaWarnings() {
     MediaWarningProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaWarningProjection<>(this, getRoot());
     getFields().put("mediaWarnings", projection);
     return projection;
  }

  public Model3dSourceProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> originalSource() {
     Model3dSourceProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new Model3dSourceProjection<>(this, getRoot());
     getFields().put("originalSource", projection);
     return projection;
  }

  public MediaPreviewImageProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> preview() {
     MediaPreviewImageProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaPreviewImageProjection<>(this, getRoot());
     getFields().put("preview", projection);
     return projection;
  }

  public Model3dSourceProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> sources() {
     Model3dSourceProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new Model3dSourceProjection<>(this, getRoot());
     getFields().put("sources", projection);
     return projection;
  }

  public MediaStatusProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> status() {
     MediaStatusProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public Model3dFragmentProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public Model3dFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public Model3dFragmentProjection<PARENT, ROOT> filename() {
    getFields().put("filename", null);
    return this;
  }

  public Model3dFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public Model3dFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Model3d {");
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
