package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementReasonCodeCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementReasonCodeCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementReasonCodeCreateUserError"));
  }

  public CashManagementReasonCodeCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementReasonCodeCreateUserErrorCodeProjection<CashManagementReasonCodeCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CashManagementReasonCodeCreateUserErrorCodeProjection<CashManagementReasonCodeCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CashManagementReasonCodeCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CashManagementReasonCodeCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CashManagementReasonCodeCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
