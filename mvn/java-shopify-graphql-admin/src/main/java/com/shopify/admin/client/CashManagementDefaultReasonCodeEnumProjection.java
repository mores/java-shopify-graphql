package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementDefaultReasonCodeEnumProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementDefaultReasonCodeEnumProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementDefaultReasonCodeEnum"));
  }

  public CashManagementDefaultReasonCodeEnumProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
