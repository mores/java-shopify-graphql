package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TransactionVoidProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TransactionVoidProjectionRoot() {
    super(null, null, java.util.Optional.of("TransactionVoidPayload"));
  }

  public TransactionVoidProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderTransactionProjection<TransactionVoidProjectionRoot<PARENT, ROOT>, TransactionVoidProjectionRoot<PARENT, ROOT>> transaction(
      ) {
    OrderTransactionProjection<TransactionVoidProjectionRoot<PARENT, ROOT>, TransactionVoidProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionProjection<>(this, this);    
    getFields().put("transaction", projection);
    return projection;
  }

  public TransactionVoidUserErrorProjection<TransactionVoidProjectionRoot<PARENT, ROOT>, TransactionVoidProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    TransactionVoidUserErrorProjection<TransactionVoidProjectionRoot<PARENT, ROOT>, TransactionVoidProjectionRoot<PARENT, ROOT>> projection = new TransactionVoidUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
