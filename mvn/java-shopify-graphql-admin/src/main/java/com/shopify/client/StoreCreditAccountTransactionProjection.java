package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountTransaction"));
  }

  public StoreCreditAccountTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> account(
      ) {
     StoreCreditAccountProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("account", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> balanceAfterTransaction(
      ) {
     MoneyV2Projection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceAfterTransaction", projection);
     return projection;
  }

  public StoreCreditAccountTransactionProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public StoreCreditAccountCreditTransactionFragmentProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> onStoreCreditAccountCreditTransaction(
      ) {
    StoreCreditAccountCreditTransactionFragmentProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> fragment = new StoreCreditAccountCreditTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountDebitRevertTransactionFragmentProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> onStoreCreditAccountDebitRevertTransaction(
      ) {
    StoreCreditAccountDebitRevertTransactionFragmentProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> fragment = new StoreCreditAccountDebitRevertTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountDebitTransactionFragmentProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> onStoreCreditAccountDebitTransaction(
      ) {
    StoreCreditAccountDebitTransactionFragmentProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> fragment = new StoreCreditAccountDebitTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountExpirationTransactionFragmentProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> onStoreCreditAccountExpirationTransaction(
      ) {
    StoreCreditAccountExpirationTransactionFragmentProjection<StoreCreditAccountTransactionProjection<PARENT, ROOT>, ROOT> fragment = new StoreCreditAccountExpirationTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
