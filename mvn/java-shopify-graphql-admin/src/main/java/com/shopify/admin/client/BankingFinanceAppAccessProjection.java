package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BankingFinanceAppAccessProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BankingFinanceAppAccessProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BankingFinanceAppAccess"));
  }

  public BankingFinanceAppAccessProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
