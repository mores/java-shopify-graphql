package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FinanceAppAccessPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FinanceAppAccessPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FinanceAppAccessPolicy"));
  }

  public FinanceAppAccessPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BankingFinanceAppAccessProjection<FinanceAppAccessPolicyProjection<PARENT, ROOT>, ROOT> access(
      ) {
     BankingFinanceAppAccessProjection<FinanceAppAccessPolicyProjection<PARENT, ROOT>, ROOT> projection = new BankingFinanceAppAccessProjection<>(this, getRoot());
     getFields().put("access", projection);
     return projection;
  }
}
