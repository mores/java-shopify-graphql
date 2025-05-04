package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class StoreCreditAccountCreditTransactionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public StoreCreditAccountCreditTransactionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountCreditTransaction"));
  }

  public StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountProjection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> account(
      ) {
     StoreCreditAccountProjection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("account", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> balanceAfterTransaction(
      ) {
     MoneyV2Projection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceAfterTransaction", projection);
     return projection;
  }

  public StoreCreditSystemEventProjection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> event(
      ) {
     StoreCreditSystemEventProjection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditSystemEventProjection<>(this, getRoot());
     getFields().put("event", projection);
     return projection;
  }

  public StoreCreditAccountTransactionOriginProjection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> origin(
      ) {
     StoreCreditAccountTransactionOriginProjection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountTransactionOriginProjection<>(this, getRoot());
     getFields().put("origin", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> remainingAmount(
      ) {
     MoneyV2Projection<StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("remainingAmount", projection);
     return projection;
  }

  public StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT> expiresAt() {
    getFields().put("expiresAt", null);
    return this;
  }

  public StoreCreditAccountCreditTransactionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on StoreCreditAccountCreditTransaction {");
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
