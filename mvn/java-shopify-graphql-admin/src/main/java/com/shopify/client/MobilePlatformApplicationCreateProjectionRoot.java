package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobilePlatformApplicationCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobilePlatformApplicationCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MobilePlatformApplicationCreatePayload"));
  }

  public MobilePlatformApplicationCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MobilePlatformApplicationProjection<MobilePlatformApplicationCreateProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationCreateProjectionRoot<PARENT, ROOT>> mobilePlatformApplication(
      ) {
    MobilePlatformApplicationProjection<MobilePlatformApplicationCreateProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationCreateProjectionRoot<PARENT, ROOT>> projection = new MobilePlatformApplicationProjection<>(this, this);    
    getFields().put("mobilePlatformApplication", projection);
    return projection;
  }

  public MobilePlatformApplicationUserErrorProjection<MobilePlatformApplicationCreateProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MobilePlatformApplicationUserErrorProjection<MobilePlatformApplicationCreateProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationCreateProjectionRoot<PARENT, ROOT>> projection = new MobilePlatformApplicationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
