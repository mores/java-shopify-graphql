package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobilePlatformApplicationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobilePlatformApplicationProjectionRoot() {
    super(null, null, java.util.Optional.of("MobilePlatformApplication"));
  }

  public MobilePlatformApplicationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AndroidApplicationFragmentProjection<MobilePlatformApplicationProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationProjectionRoot<PARENT, ROOT>> onAndroidApplication(
      ) {
    AndroidApplicationFragmentProjection<MobilePlatformApplicationProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationProjectionRoot<PARENT, ROOT>> fragment = new AndroidApplicationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppleApplicationFragmentProjection<MobilePlatformApplicationProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationProjectionRoot<PARENT, ROOT>> onAppleApplication(
      ) {
    AppleApplicationFragmentProjection<MobilePlatformApplicationProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationProjectionRoot<PARENT, ROOT>> fragment = new AppleApplicationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
