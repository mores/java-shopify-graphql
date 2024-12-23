package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnReasonProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnReasonProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnReason"));
  }

  public ReturnReasonProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
