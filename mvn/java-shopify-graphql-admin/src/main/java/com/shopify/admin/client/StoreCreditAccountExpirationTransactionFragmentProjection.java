package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class StoreCreditAccountExpirationTransactionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public StoreCreditAccountExpirationTransactionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountExpirationTransaction"));
  }

  public StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountProjection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> account(
      ) {
     StoreCreditAccountProjection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("account", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> balanceAfterTransaction(
      ) {
     MoneyV2Projection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balanceAfterTransaction", projection);
     return projection;
  }

  public StoreCreditAccountCreditTransactionProjection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> creditTransaction(
      ) {
     StoreCreditAccountCreditTransactionProjection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountCreditTransactionProjection<>(this, getRoot());
     getFields().put("creditTransaction", projection);
     return projection;
  }

  public StoreCreditSystemEventProjection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> event(
      ) {
     StoreCreditSystemEventProjection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditSystemEventProjection<>(this, getRoot());
     getFields().put("event", projection);
     return projection;
  }

  public StoreCreditAccountTransactionOriginProjection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> origin(
      ) {
     StoreCreditAccountTransactionOriginProjection<StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountTransactionOriginProjection<>(this, getRoot());
     getFields().put("origin", projection);
     return projection;
  }

  public StoreCreditAccountExpirationTransactionFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on StoreCreditAccountExpirationTransaction {");
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
