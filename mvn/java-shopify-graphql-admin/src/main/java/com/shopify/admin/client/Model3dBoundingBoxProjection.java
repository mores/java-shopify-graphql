package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class Model3dBoundingBoxProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public Model3dBoundingBoxProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Model3dBoundingBox"));
  }

  public Model3dBoundingBoxProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public Vector3Projection<Model3dBoundingBoxProjection<PARENT, ROOT>, ROOT> size() {
     Vector3Projection<Model3dBoundingBoxProjection<PARENT, ROOT>, ROOT> projection = new Vector3Projection<>(this, getRoot());
     getFields().put("size", projection);
     return projection;
  }
}
