package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StagedUploadTargetsGenerateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StagedUploadTargetsGenerateProjectionRoot() {
    super(null, null, java.util.Optional.of("StagedUploadTargetsGeneratePayload"));
  }

  public StagedUploadTargetsGenerateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StagedUploadTargetProjection<StagedUploadTargetsGenerateProjectionRoot<PARENT, ROOT>, StagedUploadTargetsGenerateProjectionRoot<PARENT, ROOT>> urls(
      ) {
    StagedUploadTargetProjection<StagedUploadTargetsGenerateProjectionRoot<PARENT, ROOT>, StagedUploadTargetsGenerateProjectionRoot<PARENT, ROOT>> projection = new StagedUploadTargetProjection<>(this, this);    
    getFields().put("urls", projection);
    return projection;
  }

  public UserErrorProjection<StagedUploadTargetsGenerateProjectionRoot<PARENT, ROOT>, StagedUploadTargetsGenerateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<StagedUploadTargetsGenerateProjectionRoot<PARENT, ROOT>, StagedUploadTargetsGenerateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
