package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ImageUploadParameterProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ImageUploadParameterProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ImageUploadParameter"));
  }

  public ImageUploadParameterProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageUploadParameterProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ImageUploadParameterProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
