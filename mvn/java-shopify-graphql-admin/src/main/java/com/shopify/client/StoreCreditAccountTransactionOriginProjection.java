package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountTransactionOriginProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountTransactionOriginProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountTransactionOrigin"));
  }

  public StoreCreditAccountTransactionOriginProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderTransactionFragmentProjection<StoreCreditAccountTransactionOriginProjection<PARENT, ROOT>, ROOT> onOrderTransaction(
      ) {
    OrderTransactionFragmentProjection<StoreCreditAccountTransactionOriginProjection<PARENT, ROOT>, ROOT> fragment = new OrderTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
