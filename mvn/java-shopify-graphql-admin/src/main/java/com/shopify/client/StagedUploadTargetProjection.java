package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StagedUploadTargetProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StagedUploadTargetProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StagedUploadTarget"));
  }

  public StagedUploadTargetProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageUploadParameterProjection<StagedUploadTargetProjection<PARENT, ROOT>, ROOT> parameters(
      ) {
     ImageUploadParameterProjection<StagedUploadTargetProjection<PARENT, ROOT>, ROOT> projection = new ImageUploadParameterProjection<>(this, getRoot());
     getFields().put("parameters", projection);
     return projection;
  }

  public StagedUploadTargetProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
