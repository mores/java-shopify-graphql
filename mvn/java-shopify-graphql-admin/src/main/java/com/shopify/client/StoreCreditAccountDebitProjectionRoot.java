package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountDebitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountDebitProjectionRoot() {
    super(null, null, java.util.Optional.of("StoreCreditAccountDebitPayload"));
  }

  public StoreCreditAccountDebitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountDebitTransactionProjection<StoreCreditAccountDebitProjectionRoot<PARENT, ROOT>, StoreCreditAccountDebitProjectionRoot<PARENT, ROOT>> storeCreditAccountTransaction(
      ) {
    StoreCreditAccountDebitTransactionProjection<StoreCreditAccountDebitProjectionRoot<PARENT, ROOT>, StoreCreditAccountDebitProjectionRoot<PARENT, ROOT>> projection = new StoreCreditAccountDebitTransactionProjection<>(this, this);    
    getFields().put("storeCreditAccountTransaction", projection);
    return projection;
  }

  public StoreCreditAccountDebitUserErrorProjection<StoreCreditAccountDebitProjectionRoot<PARENT, ROOT>, StoreCreditAccountDebitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    StoreCreditAccountDebitUserErrorProjection<StoreCreditAccountDebitProjectionRoot<PARENT, ROOT>, StoreCreditAccountDebitProjectionRoot<PARENT, ROOT>> projection = new StoreCreditAccountDebitUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
