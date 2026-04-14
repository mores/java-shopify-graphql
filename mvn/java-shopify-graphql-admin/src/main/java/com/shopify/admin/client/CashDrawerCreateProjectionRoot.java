package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashDrawerCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashDrawerCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CashDrawerCreatePayload"));
  }

  public CashDrawerCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashDrawerProjection<CashDrawerCreateProjectionRoot<PARENT, ROOT>, CashDrawerCreateProjectionRoot<PARENT, ROOT>> cashDrawer(
      ) {
    CashDrawerProjection<CashDrawerCreateProjectionRoot<PARENT, ROOT>, CashDrawerCreateProjectionRoot<PARENT, ROOT>> projection = new CashDrawerProjection<>(this, this);    
    getFields().put("cashDrawer", projection);
    return projection;
  }

  public CashDrawerCreateUserErrorProjection<CashDrawerCreateProjectionRoot<PARENT, ROOT>, CashDrawerCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CashDrawerCreateUserErrorProjection<CashDrawerCreateProjectionRoot<PARENT, ROOT>, CashDrawerCreateProjectionRoot<PARENT, ROOT>> projection = new CashDrawerCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
