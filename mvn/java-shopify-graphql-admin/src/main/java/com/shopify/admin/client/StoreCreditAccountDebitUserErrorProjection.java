package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountDebitUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountDebitUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountDebitUserError"));
  }

  public StoreCreditAccountDebitUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountDebitUserErrorCodeProjection<StoreCreditAccountDebitUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     StoreCreditAccountDebitUserErrorCodeProjection<StoreCreditAccountDebitUserErrorProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountDebitUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public StoreCreditAccountDebitUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public StoreCreditAccountDebitUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
