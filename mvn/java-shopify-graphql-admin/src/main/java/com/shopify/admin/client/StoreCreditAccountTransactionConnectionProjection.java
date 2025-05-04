package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StoreCreditAccountTransactionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountTransactionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccountTransactionConnection"));
  }

  public StoreCreditAccountTransactionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountTransactionEdgeProjection<StoreCreditAccountTransactionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     StoreCreditAccountTransactionEdgeProjection<StoreCreditAccountTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountTransactionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public StoreCreditAccountTransactionProjection<StoreCreditAccountTransactionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     StoreCreditAccountTransactionProjection<StoreCreditAccountTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountTransactionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<StoreCreditAccountTransactionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<StoreCreditAccountTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
