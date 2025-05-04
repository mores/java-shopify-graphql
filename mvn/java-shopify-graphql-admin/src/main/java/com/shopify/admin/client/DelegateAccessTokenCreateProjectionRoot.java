package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DelegateAccessTokenCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DelegateAccessTokenCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("DelegateAccessTokenCreatePayload"));
  }

  public DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DelegateAccessTokenProjection<DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>, DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>> delegateAccessToken(
      ) {
    DelegateAccessTokenProjection<DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>, DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>> projection = new DelegateAccessTokenProjection<>(this, this);    
    getFields().put("delegateAccessToken", projection);
    return projection;
  }

  public ShopProjection<DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>, DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>, DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public DelegateAccessTokenCreateUserErrorProjection<DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>, DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DelegateAccessTokenCreateUserErrorProjection<DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>, DelegateAccessTokenCreateProjectionRoot<PARENT, ROOT>> projection = new DelegateAccessTokenCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
