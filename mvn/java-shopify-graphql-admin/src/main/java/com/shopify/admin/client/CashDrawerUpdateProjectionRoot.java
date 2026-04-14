package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashDrawerUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashDrawerUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CashDrawerUpdatePayload"));
  }

  public CashDrawerUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashDrawerProjection<CashDrawerUpdateProjectionRoot<PARENT, ROOT>, CashDrawerUpdateProjectionRoot<PARENT, ROOT>> cashDrawer(
      ) {
    CashDrawerProjection<CashDrawerUpdateProjectionRoot<PARENT, ROOT>, CashDrawerUpdateProjectionRoot<PARENT, ROOT>> projection = new CashDrawerProjection<>(this, this);    
    getFields().put("cashDrawer", projection);
    return projection;
  }

  public CashDrawerUpdateUserErrorProjection<CashDrawerUpdateProjectionRoot<PARENT, ROOT>, CashDrawerUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CashDrawerUpdateUserErrorProjection<CashDrawerUpdateProjectionRoot<PARENT, ROOT>, CashDrawerUpdateProjectionRoot<PARENT, ROOT>> projection = new CashDrawerUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
