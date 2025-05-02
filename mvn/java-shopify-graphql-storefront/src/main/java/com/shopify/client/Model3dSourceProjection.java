package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class Model3dSourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public Model3dSourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Model3dSource"));
  }

  public Model3dSourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public Model3dSourceProjection<PARENT, ROOT> filesize() {
    getFields().put("filesize", null);
    return this;
  }

  public Model3dSourceProjection<PARENT, ROOT> format() {
    getFields().put("format", null);
    return this;
  }

  public Model3dSourceProjection<PARENT, ROOT> mimeType() {
    getFields().put("mimeType", null);
    return this;
  }

  public Model3dSourceProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
