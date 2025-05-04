package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StagedMediaUploadTargetProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StagedMediaUploadTargetProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StagedMediaUploadTarget"));
  }

  public StagedMediaUploadTargetProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StagedUploadParameterProjection<StagedMediaUploadTargetProjection<PARENT, ROOT>, ROOT> parameters(
      ) {
     StagedUploadParameterProjection<StagedMediaUploadTargetProjection<PARENT, ROOT>, ROOT> projection = new StagedUploadParameterProjection<>(this, getRoot());
     getFields().put("parameters", projection);
     return projection;
  }

  public StagedMediaUploadTargetProjection<PARENT, ROOT> resourceUrl() {
    getFields().put("resourceUrl", null);
    return this;
  }

  public StagedMediaUploadTargetProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
