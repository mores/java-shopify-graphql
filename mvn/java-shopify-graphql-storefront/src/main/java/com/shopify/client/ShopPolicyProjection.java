package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPolicy"));
  }

  public ShopPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ShopPolicyProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
