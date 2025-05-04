package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ConsentPolicyErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ConsentPolicyErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ConsentPolicyErrorCode"));
  }

  public ConsentPolicyErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
