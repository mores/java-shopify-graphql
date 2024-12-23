package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccountNativePagePageTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccountNativePagePageTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerAccountNativePagePageType"));
  }

  public CustomerAccountNativePagePageTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
