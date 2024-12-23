package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountCreditProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountCreditProjectionRoot() {
    super(null, null, java.util.Optional.of("StoreCreditAccountCreditPayload"));
  }

  public StoreCreditAccountCreditProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountCreditTransactionProjection<StoreCreditAccountCreditProjectionRoot<PARENT, ROOT>, StoreCreditAccountCreditProjectionRoot<PARENT, ROOT>> storeCreditAccountTransaction(
      ) {
    StoreCreditAccountCreditTransactionProjection<StoreCreditAccountCreditProjectionRoot<PARENT, ROOT>, StoreCreditAccountCreditProjectionRoot<PARENT, ROOT>> projection = new StoreCreditAccountCreditTransactionProjection<>(this, this);    
    getFields().put("storeCreditAccountTransaction", projection);
    return projection;
  }

  public StoreCreditAccountCreditUserErrorProjection<StoreCreditAccountCreditProjectionRoot<PARENT, ROOT>, StoreCreditAccountCreditProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    StoreCreditAccountCreditUserErrorProjection<StoreCreditAccountCreditProjectionRoot<PARENT, ROOT>, StoreCreditAccountCreditProjectionRoot<PARENT, ROOT>> projection = new StoreCreditAccountCreditUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
