package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutProfileProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutProfileProjectionRoot() {
    super(null, null, java.util.Optional.of("CheckoutProfile"));
  }

  public CheckoutProfileProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutProfileProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CheckoutProfileProjectionRoot<PARENT, ROOT> editedAt() {
    getFields().put("editedAt", null);
    return this;
  }

  public CheckoutProfileProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CheckoutProfileProjectionRoot<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CheckoutProfileProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CheckoutProfileProjectionRoot<PARENT, ROOT> typOspPagesActive() {
    getFields().put("typOspPagesActive", null);
    return this;
  }

  public CheckoutProfileProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
