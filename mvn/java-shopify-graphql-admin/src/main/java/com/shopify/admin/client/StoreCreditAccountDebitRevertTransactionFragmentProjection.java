package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public StoreCreditAccountDebitRevertTransactionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountDebitRevertTransaction"));
  }

  public StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountProjection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> account(
      ) {
     StoreCreditAccountProjection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("account", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> balanceAfterTransaction(
      ) {
     MoneyV2Projection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceAfterTransaction", projection);
     return projection;
  }

  public StoreCreditAccountDebitTransactionProjection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> debitTransaction(
      ) {
     StoreCreditAccountDebitTransactionProjection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountDebitTransactionProjection<>(this, getRoot());
     getFields().put("debitTransaction", projection);
     return projection;
  }

  public StoreCreditSystemEventProjection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> event(
      ) {
     StoreCreditSystemEventProjection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditSystemEventProjection<>(this, getRoot());
     getFields().put("event", projection);
     return projection;
  }

  public StoreCreditAccountTransactionOriginProjection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> origin(
      ) {
     StoreCreditAccountTransactionOriginProjection<StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountTransactionOriginProjection<>(this, getRoot());
     getFields().put("origin", projection);
     return projection;
  }

  public StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public StoreCreditAccountDebitRevertTransactionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on StoreCreditAccountDebitRevertTransaction {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
