package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StagedUploadParameterProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StagedUploadParameterProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StagedUploadParameter"));
  }

  public StagedUploadParameterProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StagedUploadParameterProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public StagedUploadParameterProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
