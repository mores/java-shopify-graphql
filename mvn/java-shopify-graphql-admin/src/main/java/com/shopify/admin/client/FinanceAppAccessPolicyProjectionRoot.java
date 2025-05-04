package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FinanceAppAccessPolicyProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FinanceAppAccessPolicyProjectionRoot() {
    super(null, null, java.util.Optional.of("FinanceAppAccessPolicy"));
  }

  public FinanceAppAccessPolicyProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BankingFinanceAppAccessProjection<FinanceAppAccessPolicyProjectionRoot<PARENT, ROOT>, FinanceAppAccessPolicyProjectionRoot<PARENT, ROOT>> access(
      ) {
    BankingFinanceAppAccessProjection<FinanceAppAccessPolicyProjectionRoot<PARENT, ROOT>, FinanceAppAccessPolicyProjectionRoot<PARENT, ROOT>> projection = new BankingFinanceAppAccessProjection<>(this, this);    
    getFields().put("access", projection);
    return projection;
  }
}
