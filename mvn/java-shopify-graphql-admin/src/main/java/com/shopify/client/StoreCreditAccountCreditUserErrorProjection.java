package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountCreditUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountCreditUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountCreditUserError"));
  }

  public StoreCreditAccountCreditUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountCreditUserErrorCodeProjection<StoreCreditAccountCreditUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     StoreCreditAccountCreditUserErrorCodeProjection<StoreCreditAccountCreditUserErrorProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountCreditUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public StoreCreditAccountCreditUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public StoreCreditAccountCreditUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
