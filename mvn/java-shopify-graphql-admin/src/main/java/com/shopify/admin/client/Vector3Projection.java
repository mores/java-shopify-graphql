package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class Vector3Projection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public Vector3Projection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Vector3"));
  }

  public Vector3Projection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public Vector3Projection<PARENT, ROOT> x() {
    getFields().put("x", null);
    return this;
  }

  public Vector3Projection<PARENT, ROOT> y() {
    getFields().put("y", null);
    return this;
  }

  public Vector3Projection<PARENT, ROOT> z() {
    getFields().put("z", null);
    return this;
  }
}
