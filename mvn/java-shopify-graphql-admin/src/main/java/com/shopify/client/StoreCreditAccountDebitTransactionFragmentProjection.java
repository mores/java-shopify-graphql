package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class StoreCreditAccountDebitTransactionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public StoreCreditAccountDebitTransactionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountDebitTransaction"));
  }

  public StoreCreditAccountDebitTransactionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountProjection<StoreCreditAccountDebitTransactionFragmentProjection<PARENT, ROOT>, ROOT> account(
      ) {
     StoreCreditAccountProjection<StoreCreditAccountDebitTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("account", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountDebitTransactionFragmentProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<StoreCreditAccountDebitTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountDebitTransactionFragmentProjection<PARENT, ROOT>, ROOT> balanceAfterTransaction(
      ) {
     MoneyV2Projection<StoreCreditAccountDebitTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceAfterTransaction", projection);
     return projection;
  }

  public StoreCreditAccountDebitTransactionFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public StoreCreditAccountDebitTransactionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on StoreCreditAccountDebitTransaction {");
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
