package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TenderTransactionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TenderTransactionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TenderTransactionConnection"));
  }

  public TenderTransactionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TenderTransactionEdgeProjection<TenderTransactionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     TenderTransactionEdgeProjection<TenderTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new TenderTransactionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public TenderTransactionProjection<TenderTransactionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     TenderTransactionProjection<TenderTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new TenderTransactionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<TenderTransactionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<TenderTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
