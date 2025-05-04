package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StorefrontAccessTokenCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StorefrontAccessTokenCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("StorefrontAccessTokenCreatePayload"));
  }

  public StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopProjection<StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>, StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>, StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public StorefrontAccessTokenProjection<StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>, StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>> storefrontAccessToken(
      ) {
    StorefrontAccessTokenProjection<StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>, StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>> projection = new StorefrontAccessTokenProjection<>(this, this);    
    getFields().put("storefrontAccessToken", projection);
    return projection;
  }

  public UserErrorProjection<StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>, StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>, StorefrontAccessTokenCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
