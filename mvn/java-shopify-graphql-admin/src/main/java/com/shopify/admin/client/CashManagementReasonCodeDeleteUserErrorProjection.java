package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementReasonCodeDeleteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementReasonCodeDeleteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementReasonCodeDeleteUserError"));
  }

  public CashManagementReasonCodeDeleteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementReasonCodeDeleteUserErrorCodeProjection<CashManagementReasonCodeDeleteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CashManagementReasonCodeDeleteUserErrorCodeProjection<CashManagementReasonCodeDeleteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CashManagementReasonCodeDeleteUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CashManagementReasonCodeDeleteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CashManagementReasonCodeDeleteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
