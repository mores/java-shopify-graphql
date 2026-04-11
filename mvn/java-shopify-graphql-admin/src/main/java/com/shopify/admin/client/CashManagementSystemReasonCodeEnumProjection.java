package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementSystemReasonCodeEnumProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementSystemReasonCodeEnumProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementSystemReasonCodeEnum"));
  }

  public CashManagementSystemReasonCodeEnumProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
