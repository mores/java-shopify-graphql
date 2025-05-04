package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StagedUploadTargetGenerateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StagedUploadTargetGenerateProjectionRoot() {
    super(null, null, java.util.Optional.of("StagedUploadTargetGeneratePayload"));
  }

  public StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MutationsStagedUploadTargetGenerateUploadParameterProjection<StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT>, StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT>> parameters(
      ) {
    MutationsStagedUploadTargetGenerateUploadParameterProjection<StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT>, StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT>> projection = new MutationsStagedUploadTargetGenerateUploadParameterProjection<>(this, this);    
    getFields().put("parameters", projection);
    return projection;
  }

  public UserErrorProjection<StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT>, StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT>, StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public StagedUploadTargetGenerateProjectionRoot<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
