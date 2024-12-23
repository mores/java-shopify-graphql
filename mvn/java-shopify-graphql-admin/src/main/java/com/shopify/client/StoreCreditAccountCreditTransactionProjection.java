package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountCreditTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountCreditTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountCreditTransaction"));
  }

  public StoreCreditAccountCreditTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountProjection<StoreCreditAccountCreditTransactionProjection<PARENT, ROOT>, ROOT> account(
      ) {
     StoreCreditAccountProjection<StoreCreditAccountCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("account", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountCreditTransactionProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<StoreCreditAccountCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountCreditTransactionProjection<PARENT, ROOT>, ROOT> balanceAfterTransaction(
      ) {
     MoneyV2Projection<StoreCreditAccountCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceAfterTransaction", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountCreditTransactionProjection<PARENT, ROOT>, ROOT> remainingAmount(
      ) {
     MoneyV2Projection<StoreCreditAccountCreditTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("remainingAmount", projection);
     return projection;
  }

  public StoreCreditAccountCreditTransactionProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public StoreCreditAccountCreditTransactionProjection<PARENT, ROOT> expiresAt() {
    getFields().put("expiresAt", null);
    return this;
  }

  public StoreCreditAccountCreditTransactionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
