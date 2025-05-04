package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StagedUploadsCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StagedUploadsCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("StagedUploadsCreatePayload"));
  }

  public StagedUploadsCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StagedMediaUploadTargetProjection<StagedUploadsCreateProjectionRoot<PARENT, ROOT>, StagedUploadsCreateProjectionRoot<PARENT, ROOT>> stagedTargets(
      ) {
    StagedMediaUploadTargetProjection<StagedUploadsCreateProjectionRoot<PARENT, ROOT>, StagedUploadsCreateProjectionRoot<PARENT, ROOT>> projection = new StagedMediaUploadTargetProjection<>(this, this);    
    getFields().put("stagedTargets", projection);
    return projection;
  }

  public UserErrorProjection<StagedUploadsCreateProjectionRoot<PARENT, ROOT>, StagedUploadsCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<StagedUploadsCreateProjectionRoot<PARENT, ROOT>, StagedUploadsCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
