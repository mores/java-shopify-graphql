package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPolicyUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPolicyUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPolicyUserError"));
  }

  public ShopPolicyUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPolicyErrorCodeProjection<ShopPolicyUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     ShopPolicyErrorCodeProjection<ShopPolicyUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ShopPolicyErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ShopPolicyUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ShopPolicyUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
