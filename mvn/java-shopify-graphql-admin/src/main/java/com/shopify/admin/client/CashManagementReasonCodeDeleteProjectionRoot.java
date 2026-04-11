package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementReasonCodeDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementReasonCodeDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CashManagementReasonCodeDeletePayload"));
  }

  public CashManagementReasonCodeDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementReasonCodeDeleteUserErrorProjection<CashManagementReasonCodeDeleteProjectionRoot<PARENT, ROOT>, CashManagementReasonCodeDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CashManagementReasonCodeDeleteUserErrorProjection<CashManagementReasonCodeDeleteProjectionRoot<PARENT, ROOT>, CashManagementReasonCodeDeleteProjectionRoot<PARENT, ROOT>> projection = new CashManagementReasonCodeDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CashManagementReasonCodeDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
