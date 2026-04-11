package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BankAccountHolderTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BankAccountHolderTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BankAccountHolderType"));
  }

  public BankAccountHolderTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
