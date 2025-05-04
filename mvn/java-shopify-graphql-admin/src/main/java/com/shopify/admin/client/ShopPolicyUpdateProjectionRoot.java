package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPolicyUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPolicyUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopPolicyUpdatePayload"));
  }

  public ShopPolicyUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPolicyProjection<ShopPolicyUpdateProjectionRoot<PARENT, ROOT>, ShopPolicyUpdateProjectionRoot<PARENT, ROOT>> shopPolicy(
      ) {
    ShopPolicyProjection<ShopPolicyUpdateProjectionRoot<PARENT, ROOT>, ShopPolicyUpdateProjectionRoot<PARENT, ROOT>> projection = new ShopPolicyProjection<>(this, this);    
    getFields().put("shopPolicy", projection);
    return projection;
  }

  public ShopPolicyUserErrorProjection<ShopPolicyUpdateProjectionRoot<PARENT, ROOT>, ShopPolicyUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ShopPolicyUserErrorProjection<ShopPolicyUpdateProjectionRoot<PARENT, ROOT>, ShopPolicyUpdateProjectionRoot<PARENT, ROOT>> projection = new ShopPolicyUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
