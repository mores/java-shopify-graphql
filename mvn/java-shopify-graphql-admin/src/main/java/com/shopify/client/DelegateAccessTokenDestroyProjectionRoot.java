package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DelegateAccessTokenDestroyProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DelegateAccessTokenDestroyProjectionRoot() {
    super(null, null, java.util.Optional.of("DelegateAccessTokenDestroyPayload"));
  }

  public DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopProjection<DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT>, DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT>, DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public DelegateAccessTokenDestroyUserErrorProjection<DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT>, DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DelegateAccessTokenDestroyUserErrorProjection<DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT>, DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT>> projection = new DelegateAccessTokenDestroyUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public DelegateAccessTokenDestroyProjectionRoot<PARENT, ROOT> status() {
    getFields().put("status", null);
    return this;
  }
}
