package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementReasonCodesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementReasonCodesProjectionRoot() {
    super(null, null, java.util.Optional.of("CashManagementReasonCodeConnection"));
  }

  public CashManagementReasonCodesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementReasonCodeEdgeProjection<CashManagementReasonCodesProjectionRoot<PARENT, ROOT>, CashManagementReasonCodesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CashManagementReasonCodeEdgeProjection<CashManagementReasonCodesProjectionRoot<PARENT, ROOT>, CashManagementReasonCodesProjectionRoot<PARENT, ROOT>> projection = new CashManagementReasonCodeEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CashManagementReasonCodeProjection<CashManagementReasonCodesProjectionRoot<PARENT, ROOT>, CashManagementReasonCodesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CashManagementReasonCodeProjection<CashManagementReasonCodesProjectionRoot<PARENT, ROOT>, CashManagementReasonCodesProjectionRoot<PARENT, ROOT>> projection = new CashManagementReasonCodeProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CashManagementReasonCodesProjectionRoot<PARENT, ROOT>, CashManagementReasonCodesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CashManagementReasonCodesProjectionRoot<PARENT, ROOT>, CashManagementReasonCodesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
