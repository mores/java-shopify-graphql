package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobilePlatformApplicationDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobilePlatformApplicationDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MobilePlatformApplicationDeletePayload"));
  }

  public MobilePlatformApplicationDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MobilePlatformApplicationUserErrorProjection<MobilePlatformApplicationDeleteProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MobilePlatformApplicationUserErrorProjection<MobilePlatformApplicationDeleteProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationDeleteProjectionRoot<PARENT, ROOT>> projection = new MobilePlatformApplicationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MobilePlatformApplicationDeleteProjectionRoot<PARENT, ROOT> deletedMobilePlatformApplicationId(
      ) {
    getFields().put("deletedMobilePlatformApplicationId", null);
    return this;
  }
}
