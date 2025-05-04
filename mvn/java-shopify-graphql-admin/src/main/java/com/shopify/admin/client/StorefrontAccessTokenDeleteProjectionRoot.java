package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StorefrontAccessTokenDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StorefrontAccessTokenDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("StorefrontAccessTokenDeletePayload"));
  }

  public StorefrontAccessTokenDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<StorefrontAccessTokenDeleteProjectionRoot<PARENT, ROOT>, StorefrontAccessTokenDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<StorefrontAccessTokenDeleteProjectionRoot<PARENT, ROOT>, StorefrontAccessTokenDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public StorefrontAccessTokenDeleteProjectionRoot<PARENT, ROOT> deletedStorefrontAccessTokenId() {
    getFields().put("deletedStorefrontAccessTokenId", null);
    return this;
  }
}
