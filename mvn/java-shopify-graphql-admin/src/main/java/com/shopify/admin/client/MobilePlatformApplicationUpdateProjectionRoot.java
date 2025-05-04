package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobilePlatformApplicationUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobilePlatformApplicationUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("MobilePlatformApplicationUpdatePayload"));
  }

  public MobilePlatformApplicationUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MobilePlatformApplicationProjection<MobilePlatformApplicationUpdateProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationUpdateProjectionRoot<PARENT, ROOT>> mobilePlatformApplication(
      ) {
    MobilePlatformApplicationProjection<MobilePlatformApplicationUpdateProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationUpdateProjectionRoot<PARENT, ROOT>> projection = new MobilePlatformApplicationProjection<>(this, this);    
    getFields().put("mobilePlatformApplication", projection);
    return projection;
  }

  public MobilePlatformApplicationUserErrorProjection<MobilePlatformApplicationUpdateProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MobilePlatformApplicationUserErrorProjection<MobilePlatformApplicationUpdateProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationUpdateProjectionRoot<PARENT, ROOT>> projection = new MobilePlatformApplicationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
