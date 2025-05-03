package com.shopify.storefront.client;

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

  public MediaContentTypeProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> mediaContentType(
      ) {
     MediaContentTypeProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaContentTypeProjection<>(this, getRoot());
     getFields().put("mediaContentType", projection);
     return projection;
  }

  public MediaPresentationProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> presentation() {
     MediaPresentationProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaPresentationProjection<>(this, getRoot());
     getFields().put("presentation", projection);
     return projection;
  }

  public ImageProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> previewImage() {
     ImageProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("previewImage", projection);
     return projection;
  }

  public Model3dSourceProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> sources() {
     Model3dSourceProjection<Model3dFragmentProjection<PARENT, ROOT>, ROOT> projection = new Model3dSourceProjection<>(this, getRoot());
     getFields().put("sources", projection);
     return projection;
  }

  public Model3dFragmentProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public Model3dFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
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
