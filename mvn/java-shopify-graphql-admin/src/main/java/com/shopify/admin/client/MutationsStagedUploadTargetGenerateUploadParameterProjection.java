package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MutationsStagedUploadTargetGenerateUploadParameterProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MutationsStagedUploadTargetGenerateUploadParameterProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MutationsStagedUploadTargetGenerateUploadParameter"));
  }

  public MutationsStagedUploadTargetGenerateUploadParameterProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MutationsStagedUploadTargetGenerateUploadParameterProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MutationsStagedUploadTargetGenerateUploadParameterProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
