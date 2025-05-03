package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPolicyWithDefaultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPolicyWithDefaultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPolicyWithDefault"));
  }

  public ShopPolicyWithDefaultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPolicyWithDefaultProjection<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public ShopPolicyWithDefaultProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ShopPolicyWithDefaultProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopPolicyWithDefaultProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ShopPolicyWithDefaultProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
