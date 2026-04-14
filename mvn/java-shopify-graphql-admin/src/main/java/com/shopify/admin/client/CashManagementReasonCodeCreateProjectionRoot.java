package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementReasonCodeCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementReasonCodeCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CashManagementReasonCodeCreatePayload"));
  }

  public CashManagementReasonCodeCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementCustomReasonCodeProjection<CashManagementReasonCodeCreateProjectionRoot<PARENT, ROOT>, CashManagementReasonCodeCreateProjectionRoot<PARENT, ROOT>> reasonCode(
      ) {
    CashManagementCustomReasonCodeProjection<CashManagementReasonCodeCreateProjectionRoot<PARENT, ROOT>, CashManagementReasonCodeCreateProjectionRoot<PARENT, ROOT>> projection = new CashManagementCustomReasonCodeProjection<>(this, this);    
    getFields().put("reasonCode", projection);
    return projection;
  }

  public CashManagementReasonCodeCreateUserErrorProjection<CashManagementReasonCodeCreateProjectionRoot<PARENT, ROOT>, CashManagementReasonCodeCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CashManagementReasonCodeCreateUserErrorProjection<CashManagementReasonCodeCreateProjectionRoot<PARENT, ROOT>, CashManagementReasonCodeCreateProjectionRoot<PARENT, ROOT>> projection = new CashManagementReasonCodeCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
