package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashDrawerFindOrCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashDrawerFindOrCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CashDrawerFindOrCreatePayload"));
  }

  public CashDrawerFindOrCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashDrawerProjection<CashDrawerFindOrCreateProjectionRoot<PARENT, ROOT>, CashDrawerFindOrCreateProjectionRoot<PARENT, ROOT>> cashDrawer(
      ) {
    CashDrawerProjection<CashDrawerFindOrCreateProjectionRoot<PARENT, ROOT>, CashDrawerFindOrCreateProjectionRoot<PARENT, ROOT>> projection = new CashDrawerProjection<>(this, this);    
    getFields().put("cashDrawer", projection);
    return projection;
  }

  public CashDrawerFindOrCreateUserErrorProjection<CashDrawerFindOrCreateProjectionRoot<PARENT, ROOT>, CashDrawerFindOrCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CashDrawerFindOrCreateUserErrorProjection<CashDrawerFindOrCreateProjectionRoot<PARENT, ROOT>, CashDrawerFindOrCreateProjectionRoot<PARENT, ROOT>> projection = new CashDrawerFindOrCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
