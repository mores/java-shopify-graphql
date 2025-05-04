package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutProfileProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutProfileProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutProfile"));
  }

  public CheckoutProfileProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutProfileProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CheckoutProfileProjection<PARENT, ROOT> editedAt() {
    getFields().put("editedAt", null);
    return this;
  }

  public CheckoutProfileProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CheckoutProfileProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CheckoutProfileProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CheckoutProfileProjection<PARENT, ROOT> typOspPagesActive() {
    getFields().put("typOspPagesActive", null);
    return this;
  }

  public CheckoutProfileProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
