package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountDebitTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountDebitTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountDebitTransaction"));
  }

  public StoreCreditAccountDebitTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountProjection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> account(
      ) {
     StoreCreditAccountProjection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("account", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> balanceAfterTransaction(
      ) {
     MoneyV2Projection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceAfterTransaction", projection);
     return projection;
  }

  public StoreCreditSystemEventProjection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> event(
      ) {
     StoreCreditSystemEventProjection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditSystemEventProjection<>(this, getRoot());
     getFields().put("event", projection);
     return projection;
  }

  public StoreCreditAccountTransactionOriginProjection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> origin(
      ) {
     StoreCreditAccountTransactionOriginProjection<StoreCreditAccountDebitTransactionProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountTransactionOriginProjection<>(this, getRoot());
     getFields().put("origin", projection);
     return projection;
  }

  public StoreCreditAccountDebitTransactionProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public StoreCreditAccountDebitTransactionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
