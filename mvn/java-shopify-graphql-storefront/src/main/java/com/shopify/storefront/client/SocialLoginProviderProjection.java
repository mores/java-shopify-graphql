package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SocialLoginProviderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SocialLoginProviderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SocialLoginProvider"));
  }

  public SocialLoginProviderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SocialLoginProviderProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }
}
