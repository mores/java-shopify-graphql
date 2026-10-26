package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnPoliciesReturnWindowStartingFromProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnPoliciesReturnWindowStartingFromProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnPoliciesReturnWindowStartingFrom"));
  }

  public ReturnPoliciesReturnWindowStartingFromProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
