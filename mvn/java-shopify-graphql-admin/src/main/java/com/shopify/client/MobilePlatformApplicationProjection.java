package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobilePlatformApplicationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobilePlatformApplicationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MobilePlatformApplication"));
  }

  public MobilePlatformApplicationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AndroidApplicationFragmentProjection<MobilePlatformApplicationProjection<PARENT, ROOT>, ROOT> onAndroidApplication(
      ) {
    AndroidApplicationFragmentProjection<MobilePlatformApplicationProjection<PARENT, ROOT>, ROOT> fragment = new AndroidApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppleApplicationFragmentProjection<MobilePlatformApplicationProjection<PARENT, ROOT>, ROOT> onAppleApplication(
      ) {
    AppleApplicationFragmentProjection<MobilePlatformApplicationProjection<PARENT, ROOT>, ROOT> fragment = new AppleApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
