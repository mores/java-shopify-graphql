package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountTransactionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountTransactionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountTransactionEdge"));
  }

  public StoreCreditAccountTransactionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountTransactionProjection<StoreCreditAccountTransactionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     StoreCreditAccountTransactionProjection<StoreCreditAccountTransactionEdgeProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountTransactionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public StoreCreditAccountTransactionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
