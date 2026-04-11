package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashTransactionActivityTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashTransactionActivityTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashTransactionActivityType"));
  }

  public CashTransactionActivityTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
