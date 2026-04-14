package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementCustomReasonCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementCustomReasonCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementCustomReasonCode"));
  }

  public CashManagementCustomReasonCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementCustomReasonCodeProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public CashManagementCustomReasonCodeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
