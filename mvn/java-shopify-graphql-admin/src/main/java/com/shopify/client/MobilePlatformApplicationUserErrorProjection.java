package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobilePlatformApplicationUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobilePlatformApplicationUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MobilePlatformApplicationUserError"));
  }

  public MobilePlatformApplicationUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MobilePlatformApplicationUserErrorCodeProjection<MobilePlatformApplicationUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MobilePlatformApplicationUserErrorCodeProjection<MobilePlatformApplicationUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MobilePlatformApplicationUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MobilePlatformApplicationUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MobilePlatformApplicationUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
